package JavaStudy.NestedClass;

import java.util.Scanner;

public class ButtonExecute {
    public static void main(String[] args) {
        Button button = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Btn Click");
            }
        }

        button.setClickListener(new OkListener());

        Scanner scan = new Scanner(System.in);
        if (scan.nextInt() == 1)
            button.onClick();
    }
}
