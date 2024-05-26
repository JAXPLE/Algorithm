package OCJP;

class Atom {
    Atom() {
        System.out.println("atom ");
    }
}

class Rock extends Atom {
    Rock(String type) {
        System.out.println(type);
    }
}

class Mountain extends Rock {
    Mountain() {
        super("granite");
        new Rock("granite");
    }
}

public class Question13 {
    public static void main(String[] args) {
        new Mountain();
    }
}
