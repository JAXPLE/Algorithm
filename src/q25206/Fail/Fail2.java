package q25206.Fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//isNaN 메소드로 오류는 All F 케이스는 잡았지만, 계속 오류가 나서 결국 그날 해결못함.
public class Fail2 {
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
        double result = Double.isNaN(resultA/resultB) ? 0.000000 : resultA/resultB;

//        for (int i = 0; i < data.length; i++) {
//            System.out.println(Arrays.toString(data[i]));
//        }
//        System.out.println();

        bw.write(String.format("%5f",result));
        bw.close();
    }
}