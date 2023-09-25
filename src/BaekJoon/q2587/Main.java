package BaekJoon.q2587;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;
        int total = 0;

        int[]data = new int[n];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(br.readLine());
            total += data[i];
        }

        for (int i = 0; i < data.length; i++) {
            int index = i;
            for (int j = index; j < data.length; j++) {
                if (data[index] < data[j]) index = j;
            }
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }

        System.out.println(total/5);
        System.out.println(data[n/2]);

        br.close();
    }
}