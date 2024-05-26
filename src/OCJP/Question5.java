package OCJP;

public class Question5 {
    public static void main(String[] args) {
        new Question5().go();
    }

    public void go() {
        Runnable runnable = () -> {
            System.out.println("foo");
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.start();
    }
}
