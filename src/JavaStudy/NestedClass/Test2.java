package JavaStudy.NestedClass;

class Block2 {
    interface BtnListener {
        void onClick();
    }

    BtnListener btnListener;

    public void setBtnListener(BtnListener btnListener) {
        this.btnListener = btnListener;
    }

    public void click() {
        this.btnListener.onClick();
    }
}

public class Test2 {
    public void main(String[] strings) {
        Block2 block2 = new Block2();

        class BtnClicker implements Block2.BtnListener {
            @Override
            public void onClick() {
                System.out.println("Click!");
            }
        }

        block2.setBtnListener(new BtnClicker());
        block2.click();
    }
}
