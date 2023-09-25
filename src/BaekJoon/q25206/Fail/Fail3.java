package BaekJoon.q25206.Fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//array > switch 로 방향성을 바꿨지만 주요 로직자체는 바뀌지 않았음.
public class Fail3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 20;
        double score = 0;
        double result = 0;
        for (int i = 0; i < n; i++) {
            String[] name = br.readLine().split(" ");

            switch (name[2]) {
                case "A+":
                    name[2] = "4.5";
                    break;
                case "A0":
                    name[2] = "4.0";
                    break;
                case "B+":
                    name[2] = "3.5";
                    break;
                case "B0":
                    name[2] = "3.0";
                    break;
                case "C+":
                    name[2] = "2.5";
                    break;
                case "C0":
                    name[2] = "2.0";
                    break;
                case "D+":
                    name[2] = "1.5";
                    break;
                case "D0":
                    name[2] = "1.0";
                    break;
                case "F":
                case "P":
                    name[2] = "0.0";
                    break;
                default:
                    break;
            }
            if (!(name[2].equals("F")) && !(name[2].equals("P"))) {
                result += Double.parseDouble(name[1]) * Double.parseDouble(name[2]);
                score += Double.parseDouble(name[1]);
            }
        }

        bw.write(String.format("%6f",result/score));
        bw.close();
    }
}