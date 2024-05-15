package JavaStudy.Generic;
class TV {

}

class Product <K,M> {
    public K kind;
    public M model;

    public K getKind() {
        return kind;
    }

    public M getModel() {
        return model;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public void setModel(M model) {
        this.model = model;
    }
}

public class GenericExample2 {
    public static void main(String[] args) {
        Product<TV, String> product = new Product<>();
        product.setKind(new TV());
        product.setModel("티비");

    }
}
