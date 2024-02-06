package JavaStudy.OCJP;

class Foo {
    public int a = 3;
    public void addFive() {
        a += 5;
        System.out.print("f ");
    }
}

class Bar extends Foo {
    public int a = 8;
    public void addFive() {
        a += 5;
        System.out.print("b ");
    }
}

public class Question34 {
    public static void main(String[] args) {
        Foo f = new Bar();
        /*
        f는 Foo class의 참조변수지만, 객체는 Bar 클래스의 인스턴스 입니다.
        java에서 필드변수가 아닌 메소드 경우 객체의 실제 타입을 기반으로 동적 바인딩됌.
        동적바인딩 -> 동적 디스패치, 런타임 다형성 이라고 부름.

        하지만, 필드변수의 경우 컴파일러가 참조 변수의 타입을 기반으로 결정하고 컴파일 시간동안 정적으로 바인딩됌.
         */
        f.addFive();
        System.out.println(f.a);

//        Bar b = new Bar();
//        b.addFive();
//        System.out.println(b.a);
    }
}
