package JavaStudy.Sort;

import java.util.*;

public class SortingWork {
    public static void main(String[] args) {
        User[] users = new User[] {
                new User("name1", 14),
                new User("name3", 23),
                new User("name6", 17)
        };

        //users array -> array List 로 변경
//        ArrayList<User> userArr = new ArrayList<>(List.of(users)); // << 이러면 불변 immutable 배열로 내부 수정이 불가능해서 sorting 안됌
        ArrayList<User> userArr = new ArrayList<>(Arrays.asList(users));

        //방법 2
//        List.of(users).sort((a,b) -> b.getAge() - a.getAge()); 불가능
        userArr.sort((a,b) -> b.getAge() - a.getAge());
        userArr.forEach(System.out::println);

        //방법 1
        Comparator<User> userComparator = new java.util.Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(userArr, userComparator);
        userArr.forEach(System.out::println);
    }
}
