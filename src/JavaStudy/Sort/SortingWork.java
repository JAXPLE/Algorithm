package JavaStudy.Sort;

import java.util.*;
import java.util.stream.Stream;

public class SortingWork {
    public static void main(String[] args) {
        ComparatorUser[] comparatorUsers = new ComparatorUser[] {
                new ComparatorUser("name1", 14),
                new ComparatorUser("name3", 23),
                new ComparatorUser("name6", 17)
        };

        //users array -> array List 로 변경
//        ArrayList<User> userArr = new ArrayList<>(List.of(users)); // << 이러면 불변 immutable 배열로 내부 수정이 불가능해서 sorting 안됌
        ArrayList<ComparatorUser> comparatorUserArr = new ArrayList<>(Arrays.asList(comparatorUsers));



//        Comparator
        //방법 1
//        List.of(users).sort((a,b) -> b.getAge() - a.getAge()); 불가능
        comparatorUserArr.sort((a, b) -> b.age() - a.age());
//        userArr.sort((a,b) -> Integer.compare(a.getAge(), b.getAge()));
        comparatorUserArr.forEach(System.out::println);


        //방법 2
        Comparator<ComparatorUser> userComparator = new Comparator<ComparatorUser>() {
            @Override
            public int compare(ComparatorUser o1, ComparatorUser o2) {
                return o1.age() - o2.age();
            }
//            @Override
//            public int compare(User o1, User o2) {
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
        };

        Collections.sort(comparatorUserArr, userComparator);
        comparatorUserArr.forEach(System.out::println);



        //Comparable
        ComparableUser[] comparableUsers = new ComparableUser[] {
                new ComparableUser("name1", 14),
                new ComparableUser("name3", 23),
                new ComparableUser("name6", 17)
        };

        //방법1
        List<ComparableUser> users = Arrays.asList(comparableUsers);
//        users.forEach(System.out::println);

        users.sort(Comparable::compareTo);
//        users.forEach(System.out::println);

        //방법2
        Stream<ComparableUser> sortedUsers = users.stream().sorted(); //increase
//        Stream<ComparableUser> sortedUsers = users.stream().sorted(Comparator.reverseOrder()); //decrease
        sortedUsers.forEach(System.out::println);
    }
}
