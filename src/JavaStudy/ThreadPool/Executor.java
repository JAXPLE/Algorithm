package JavaStudy.ThreadPool;

import java.util.concurrent.*;

public class Executor {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(
                60,
                50,
                10,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>()
        );


    }
}
