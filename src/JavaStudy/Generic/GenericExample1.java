package JavaStudy.Generic;

class Box<T> {
    public T content;
}

public class GenericExample1 {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        System.out.println(box1.content = "안녕");
    }
}
