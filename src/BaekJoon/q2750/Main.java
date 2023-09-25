package BaekJoon.q2750;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[]data = new int[n];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }

        /*for (int i = 0; i < data.length; i++) {
            int index = i;
            for (int j = index; j < data.length; j++) {
                if (data[index] > data[j]) {
                    index = j;
                }
            }
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }*/
        Arrays.sort(data);

//        System.out.println(Arrays.toString(data));
        for (int print : data)
            System.out.println(print);
    }
}