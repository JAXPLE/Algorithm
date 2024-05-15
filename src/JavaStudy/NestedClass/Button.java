package JavaStudy.NestedClass;

public class Button {
//     public static interface ClickListener {
//         void onClick();
//     }
//
//    private ClickListener clickListener;
//
//     public void setClickListener(ClickListener clickListener) {
//         this.clickListener = clickListener;
//     }
//
//     public void onClick() {
//         this.clickListener.onClick();
//     }

    public static interface BtnClick {
        void onClick();
    }

    private BtnClick btnClick;

    public void setBtnClick(BtnClick btnClick) {
        this.btnClick = btnClick;
    }

    public void click() {
        if (this.btnClick == null)
            throw new RuntimeException("Btn is null");
        this.btnClick.onClick();
    }

    public BtnClick getBtnClick() {
        return this.btnClick;
    }
}
