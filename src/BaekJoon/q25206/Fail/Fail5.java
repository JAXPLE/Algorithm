package BaekJoon.q25206.Fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//용민씨랑 같이 풀어서 맞추긴 했다만은,,, 기존 코드가 왜 틀렸는지 알고 싶어서 다시 접근하러감
public class Fail5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int turn = 20;
        double result = 0.0;
        double slash = 0.0;
        for (int i = 0; i < turn; i++) {
            String[] info = br.readLine().split(" ");
            System.out.println(info[1]);
            System.out.println(info[2]);

            double info2 = 0.0;
            if (info[2].equals("A+")) info2 = 4.5;
            else if (info[2].equals("A0")) info2 = 4.0;
            else if (info[2].equals("B+")) info2 = 3.5;
            else if (info[2].equals("B0")) info2 = 3.0;
            else if (info[2].equals("C+")) info2 = 2.5;
            else if (info[2].equals("C0")) info2 = 2.0;
            else if (info[2].equals("D+")) info2 = 1.5;
            else if (info[2].equals("D0")) info2 = 1.0;
            else continue;

            result += Double.parseDouble(info[1]) * info2;
            slash += Double.parseDouble(info[1]);

        }
        bw.write(String.format("%.6f", result/slash));
        bw.close();
    }
}