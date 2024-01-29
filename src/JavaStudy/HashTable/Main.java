package JavaStudy.HashTable;

public class Main {
    public static void main(String[] main) {
        HastTable<Integer, String> map = new HastTable<>();


//        put
        System.out.println("put");
        map.put(10,"십");

//        get
        System.out.println("get " + map.get(10));

//        exception
        System.out.println(map.get(2));

//        update
        map.update(10, "삼");
        System.out.println("update " + map.get(10));

//        exception
        map.update(1,"삼");

//        remove
        map.remove(10);
        System.out.println("remove " + map.get(10));
    }
}
