package JavaStudy.AnonymousObj;

public class Human {
    public static void main(String[] args) {
        Tire tire = new Tire();
        tire.rollingTire();

        tire = new Tire() {
            @Override
            public void rollingTire() {
                System.out.println("타이어가 굴러갑니다");
            }
        };
        tire.rollingTire();
    }
}
