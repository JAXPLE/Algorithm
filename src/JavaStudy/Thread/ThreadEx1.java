package JavaStudy.Thread;

class ThreadEx1_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("-");
            ThreadEx1.increaseCntDown();
            System.out.print(ThreadEx1.cntDown);
        }
    }
}

class ThreadEx1_3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("|");
        }
    }
}

public class ThreadEx1 {
    static int cntDown = 0;
    public static void main(String[] args) {

        while (cntDown < 100) {
            ThreadEx1_2 threadEx12 = new ThreadEx1_2();
            threadEx12.start();

            Thread thread = new Thread(new ThreadEx1_3());
            thread.start();

//            ThreadEx3 threadEx3 = new ThreadEx3();
//            threadEx3.run();

            if (cntDown == 10)
                System.out.println();
        }
    }

    public synchronized static void increaseCntDown() {
        cntDown += 1;
    }
}
