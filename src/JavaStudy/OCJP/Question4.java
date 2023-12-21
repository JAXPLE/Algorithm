package JavaStudy.OCJP;

class PingPong2 {
    synchronized void hit(long n) {
        for (int i = 1; i < 3; i++) {
            System.out.println(n + "-" + i + " ");
        }
    }
}
public class Question4 implements Runnable {
    static PingPong2 pingPong2 = new PingPong2();

    public static void main(String[] args) throws Exception {
        new Thread(new Question4()).start();
        new Thread(new Question4()).start();
    }

    public void run() {pingPong2.hit(Thread.currentThread().getId());}
}
