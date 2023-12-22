package JavaStudy.OCJP;

interface TestInterface {
    String toString();
}
public class Question14 {
    public static void main(String[] args) {
        System.out.println(new TestInterface() {
            @Override
            public String toString() {
                return "test";
            }
        });
    }
}
