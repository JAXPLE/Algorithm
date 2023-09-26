package 알고리즘.조합;

import java.util.Vector;

public class Main {
    static int[] a = {1, 2, 3, 4, 5};
    static int n = a.length;
    static int k = 3; //뽑는 조합의 개수

    static void print (Vector<Integer> b) {
        for(int num : b) System.out.print(num);
        System.out.println();
    }

    static void combi(int startIndex, Vector<Integer> b) {
        if (b.size() == k) {
            print(b);
            return;
        }

        for (int i = startIndex + 1; i < n; i++) {
            b.add(i);
            combi(i, b);
            b.remove(b.size() - 1);
        }
    }

    public static void main(String[] args) {
        Vector<Integer> b = new Vector<>();
        combi(-1, b);
    }
}