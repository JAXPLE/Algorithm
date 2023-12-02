package JavaStudy.Thread;

import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable runnable = () -> {
            System.out.println("Thread " + Thread.currentThread().getName());
//            계속 대기함
        };
        executorService.execute(runnable);
        executorService.shutdown();
        Thread.sleep(1000L);
//        executorService.shutdown();

        shutDown();
    }
     private static void shutDown() throws InterruptedException {
        Runnable runnable = () -> {
            System.out.println("Start");
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Interrupt");
                    break;
                }
            }
        };
        System.out.println("End");
    }
}
