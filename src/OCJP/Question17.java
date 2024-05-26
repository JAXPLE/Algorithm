package OCJP;

class Super {
    private int a;
    protected Super(int a) {this.a = a;}
}

class Sub extends Super {
    public Sub(int a) {super(a);}
    public Sub() {this(5);}
}

public class Question17 {
    public static void main(String[] args) {

    }
}
