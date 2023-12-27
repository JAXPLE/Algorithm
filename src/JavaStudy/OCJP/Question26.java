package JavaStudy.OCJP;

import java.text.NumberFormat;
import java.util.Locale;

public class Question26 {
    public static void main(String[] args) {
        double input = 314159.26;
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALIAN);
        String b = "";

        System.out.println(nf.format(input));
    }
}
