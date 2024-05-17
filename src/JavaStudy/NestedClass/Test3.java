package JavaStudy.NestedClass;

class Button3 {
    interface ClickListener2 {
        void onClick();
    }

    ClickListener2 clickListener2;

    public void setClickListener2(ClickListener2 clickListener2) {
        this.clickListener2 = clickListener2;
    }

    public void click() {
        this.clickListener2.onClick();
    }
}

public class Test3 {
    public static void main(String[] args) {
        Button3 button3 = new Button3();

        class Btn implements Button3.ClickListener2 {
            @Override
            public void onClick() {
                System.out.println("CLICK!!");
            }
        }

        button3.setClickListener2(new Btn());
        button3.click();
    }
}
