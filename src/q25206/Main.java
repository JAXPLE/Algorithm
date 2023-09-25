package q25206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Double[]> data = new ArrayList<>();
        StringTokenizer st;
        double totalScore = 0.0;
        double weightedSum = 0.0;
        int n = 20;

        for (int i = 0; i < n; i++) {
            Double[] temp = new Double[2];
            st = new StringTokenizer(br.readLine());
            st.nextToken();

            temp[0] = Double.parseDouble(st.nextToken());
            totalScore += temp[0];

            String grade = st.nextToken();
            switch (grade) {
                case "A+": temp[1] = 4.5; break;
                case "A0": temp[1] = 4.0; break;
                case "B+": temp[1] = 3.5; break;
                case "B0": temp[1] = 3.0; break;
                case "C+": temp[1] = 2.5; break;
                case "C0": temp[1] = 2.0; break;
                case "D+": temp[1] = 1.5; break;
                case "D0": temp[1] = 1.0; break;
                default: temp[1] = 0.0;
            }

            // P/F 과목은 계산에서 제외
            if (!grade.equals("P")) {
                weightedSum += temp[0] * temp[1];
            }

            data.add(temp);
        }

        // 전공평점 계산
        double majorGPA = weightedSum / totalScore;

        bw.write(String.format("%.6f",majorGPA));
        bw.close();
    }
}
