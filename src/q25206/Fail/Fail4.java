package q25206.Fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//진짜 왜 틀렸는지 감도 안옴ㅋ ㅋㅋㅋ 다시 예제읽고 접근해야겠음;;
public class Fail4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int turn = 20;
        double result = 0.0;
        double slash = 0.0;
        for (int i = 0; i < turn; i++) {
            String[] info = br.readLine().split(" ");
            if (!(info[2].equals("F")) && !(info[2].equals("P"))) {
                double info2 = 0.0;
                if (info[2].equals("A+")) info2 = 4.5;
                else if (info[2].equals("A0")) info2 = 4.0;
                else if (info[2].equals("B+")) info2 = 3.5;
                else if (info[2].equals("B0")) info2 = 3.0;
                else if (info[2].equals("C+")) info2 = 2.5;
                else if (info[2].equals("C0")) info2 = 2.0;
                else if (info[2].equals("D+")) info2 = 1.5;
                else if (info[2].equals("D0")) info2 = 1.0;
                result += Double.parseDouble(info[1]) * info2;
                slash += Double.parseDouble(info[1]);
            }
        }
        bw.write(String.format("%.6f", result / slash));
        bw.close();
    }
}