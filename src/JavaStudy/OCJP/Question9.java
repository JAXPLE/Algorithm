package JavaStudy.OCJP;


interface A {
    void doSomething(String thing);
}

class AImpl implements A {
    @Override
    public void doSomething(String msg) {}
}

class B {
    public A doIt() {
        //code
        return new AImpl();
    }
    public String execute() {
        //execute Code
        return null;
    }
}

class C extends B {
    public AImpl doIt() {
        return new AImpl();
    }
    public Object execute() { // 그 클래스로 지정해줘야함 ㅋㅋ 상위클래스 올리면 안됌ㅋㅋ
        return null;
    }
}

public class Question9 {
}
