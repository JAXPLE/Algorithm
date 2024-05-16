package JavaStudy.NestedClass;

class TestButton {
    interface OnClick {
        void onClick();
    }

    OnClick onClick;

    public void setOnClick(OnClick onClick) {
        this.onClick.onClick();
    }
}

public class Test1 {
    public static void main(String[] args) {
        TestButton testButton = new TestButton();

        class ClickEvent implements TestButton.OnClick {
            @Override
            public void onClick() {
                System.out.println("click!");
            }
        }

        testButton.setOnClick(new ClickEvent());
    }
}
