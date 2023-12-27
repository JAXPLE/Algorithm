package JavaStudy.OCJP;

import java.io.Serializable;

class Food implements Serializable {
    int good = 3;
}

class Fruit extends Food {
    int juice = 5;
}

class Banana extends Fruit {
    int yellow = 4;
}

public class Question24 extends Fruit {
    public static void main(String[] args) {
        Banana b1 = new Banana(); Banana b2 = new Banana();
//        b1.serializeBanana(b);
//        b2 =  b.deserializeBanana();
        System.out.println("restore " + b2.yellow + b2.juice + b2.good);
    }
}
