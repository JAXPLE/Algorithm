package JavaStudy.OCJP;

public class Question35 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123");
        String s1 = "123";

        sb.append("abc");
        s1 = s1.concat("abc"); //like append function

        System.out.println(sb + " " + s1);
    }
}
