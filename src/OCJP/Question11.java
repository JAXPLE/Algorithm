
package OCJP;

import static OCJP.Rainbow.MyColor.RED;
import static OCJP.Rainbow.MyColor.BLUE;

class Rainbow {
    public enum MyColor {
        RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);

        private final int rgb;

        MyColor (int rgb) {
            this.rgb = rgb;
        }

        public int getRgb() {
            return rgb;
        }
    }
}

public class Question11 {
    public static void main(String[] args) {
        if (RED.getRgb() > BLUE.getRgb()) { //ㅋㅋ이게되네
            System.out.println("test");
        }
    }
}
