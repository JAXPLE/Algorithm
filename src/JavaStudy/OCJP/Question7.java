package JavaStudy.OCJP;

public class Question7 {
    public static void main(String[] args) {
        new Question7().go(1, "hi");
        new Question7().go(2, "hi", "world");
    }

    public void go(int x, String... y) {
        /*
        index 0 -> hi
        index 1 -> world
         */
        System.out.println(y[y.length - 1]);
    }
}
