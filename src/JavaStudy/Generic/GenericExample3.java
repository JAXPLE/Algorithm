package JavaStudy.Generic;

interface Model<M> {
    M getModel();
}

class Coupang {
    public void introduce() {
        System.out.println("쿠팡 모델입니다.");
    }
}

class Amazon {
    public void introduce() {
        System.out.println("아마존 모델입니다.");
    }
}

class CoupangManagement implements Model<Coupang> {
    @Override
    public Coupang getModel() {
        System.out.println("쿠팡 매니지먼트 모델입니다.");
        return new Coupang();
    };
}

class AmazonManagement implements Model<Amazon> {
    @Override
    public Amazon getModel() {
        System.out.println("아마존 매니지먼트 모델입니다.");
        return new Amazon();
    };
}

public class GenericExample3 {
    public static void main(String[] args) {
        /*
        원본 모델이 따로 존재하고, 해당 모델을 overriding 해서 원본을 살리며 바꿀수있다?
         */

        CoupangManagement coupangManagement = new CoupangManagement();
        Coupang coupang = coupangManagement.getModel();
        coupang.introduce();

        AmazonManagement amazonManagement = new AmazonManagement();
        Amazon amazon = amazonManagement.getModel();
        amazon.introduce();
    }
}
