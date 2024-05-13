package JavaStudy.NestedClass;

public class NestedClass {

    class B {
        int field1 = 1;
        static int field2 = 2;

        public B() {
            System.out.println("constructor execute");
        }

        void method1() {
            System.out.println("method 1 execute");
        }

        static void method2() {
            System.out.println("method 2 execute");
        }
    }

    B field = new B();

    NestedClass() {
        B b = new B();
    }

    public static void main(String[]args) {
        NestedClass nestedClass = new NestedClass();
        NestedClass.B nestedClassB = nestedClass.new B();

    }
}
