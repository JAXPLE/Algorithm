package BaekJoon.q25206.Fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//하나하나 잘라넣고 파싱하면서 코딩했는데,, All F에서 NaN오류만나고 멘탈 폭팔..
public class Fail1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [][] data = new String[20][3];
        String[]grade = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
        String[]score = {"4.5","4.0","3.5","3.0","2.5","2.0","1.5","1.0","5","5"};

        int n = 20;
        for (int i = 0; i < n; i++) {
            String[]info = br.readLine().split(" ");
            data[i][0] = info[1];
            data[i][1] = info[2];
        }

        for (int i = 0; i < n; i++) {
            int idx = -1;
            for (int j = 0; j < grade.length; j++) {
                if (data[i][1].equals(grade[j])){
                    idx = j;
                    break;
                }
            }
            data[i][1] = score[idx];
        }

        for (int i = 0; i < data.length; i++) {
            double firstScore = Double.parseDouble(data[i][0]);
            double secondScore = Double.parseDouble(data[i][1]);
            data[i][2] = firstScore*secondScore + "";
        }

        double resultA = 0;
        double resultB = 0;
        for (int i = 0; i < n; i++) {
            if (!data[i][1].equals("5")){
                resultA += Double.parseDouble(data[i][2]);
                resultB += Double.parseDouble(data[i][0]);
            }
        }
        bw.write(String.format("%6f\n",resultA/resultB));

//        for (int i = 0; i < data.length; i++) {
//            System.out.println(Arrays.toString(data[i]));
//        }
        bw.close();
    }
}