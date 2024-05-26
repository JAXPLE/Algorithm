package OCJP;

class SuperCalc {
    protected static int multiply(int a, int b) {
        return a * b;
    }
}

class SubCalc extends SuperCalc {
    public static int multiply(int a, int b) {
//        return super.multiply(a,b);
        return 0; //컴파일 에러방지 임시반환
    }
}

public class Question33 {
    public static void main(String[] args) {
        SubCalc sc = new SubCalc();
//        System.out.println(sc.multiply(3,4));
        System.out.println(SuperCalc.multiply(2,2));
    }
}
