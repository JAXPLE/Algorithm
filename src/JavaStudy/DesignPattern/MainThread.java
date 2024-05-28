package JavaStudy.DesignPattern;

import org.w3c.dom.UserDataHandler;

import java.util.ArrayList;

public class MainThread {
    public static void main(String[] args) {
        ArrayList<User> userDataHandler = LazyHolder.getLazyHolder1();

        userDataHandler.add(new User("홍길동1", 15));
        userDataHandler.add(new User("홍길동2", 55));
        userDataHandler.add(new User("홍길동3", 25));


        ArrayList<User> userDataHandler2 = LazyHolder.getLazyHolder1();
        System.out.println(userDataHandler2);
    }
}
