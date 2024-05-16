package JavaStudy.Generic;

class Block<T> {
    T genericVariable1;

    public T getGenericVariable1() {
        return this.genericVariable1;
    }

    public void setGenericVariable1(T genericVariable1) {
        this.genericVariable1 = genericVariable1;
    }
}

public class GenericExample4 {
    public static <T> Block<T> block(T t) {
        Block<T> block = new Block<>();
        block.setGenericVariable1(t);
        return block;
    }

    public static void main(String[] strings) {
        Block<Integer> block1 = block(100);
        System.out.println(block1.getGenericVariable1());

        Block<String> block2 = block("hunit");
        System.out.println(block2.getGenericVariable1());
    }
}
