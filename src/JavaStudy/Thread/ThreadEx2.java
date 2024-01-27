package JavaStudy.Thread;

import java.util.ArrayList;

public class ThreadEx2 {
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        threads.add(new Thread(() -> System.out.println(Thread.currentThread().getName())));
        threads.add(new Thread(() -> System.out.println(Thread.currentThread().getName())));
        threads.add(new Thread(() -> System.out.println(Thread.currentThread().getName())));

        for (Thread thread : threads) {
            thread.start();
//            thread.run(); //main thread 에 속한 싱글스레딩
        }

    }
}
