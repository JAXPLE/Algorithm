package OCJP;

class Money {
    private String country = "korea";
    public String getC() {return country;}
}

class Yen extends Money {
    public String getC() {return super.getC();}//country}
}

public class Question23 extends Money {
    public String getC(int x) {return super.getC();}

    public static void main(String[] args) {
        System.out.println(new Yen().getC() + " " + new Question23().getC());
    }
}
