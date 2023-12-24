package JavaStudy.OCJP;
class Blip {
    protected int blipvert(int x) {
        return 0;
    }
}

class Vert extends Blip {
    public int blipvert(int x) {return 0;}
//    private int blipvert(int x) {return 0;}
    private int blipvert(long x) {return 0;}
//    protected long blipvert(int x) {return 0;}
//    protected int blipvert(long x) {return 0;}
//    protected long blipvert(long x) {return 0;}
//    protected long blipvert(int x, int y) {return 0;}
}

public class Question16 extends Blip {
    public static void main(String[] args) {

    }
}
