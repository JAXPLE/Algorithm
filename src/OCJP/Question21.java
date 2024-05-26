package OCJP;


class Building {

}

public class Question21 extends Building {
    public static void main(String[] args) {
        Building building = new Building();

        Question21 q1 = new Question21();
        Question21 q2 = (Question21) building;

        Object obj1 = (Object) building;
//        String str1 = (String) building;

        Building building1 = (Building) building;
    }
}
