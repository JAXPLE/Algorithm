package 알고리즘.재귀함수;

public class Main {
    static int fact(int n) {
        if (n == 1 || n == 0) return 1;
        return n * fact(n - 1);
    }

    static int fibo(int n) {
        if (n == 0 || n == 1) return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("fact(n) " + fact(n));
        System.out.println("fibo(n) " + fibo(n));
    }
}