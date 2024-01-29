package BaekJoon.q4344;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Fail1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] tmp = new int[Integer.parseInt(st.nextToken())];

            int sum = 0;
            for (int j = 0; j<tmp.length; j++){
                tmp[j] = Integer.parseInt(st.nextToken());
                sum += tmp[j];
            }

            double aver = sum/tmp.length;
            int cnt = 0;
            for (int j = 0; j<tmp.length; j++){
                if (tmp[j] > aver)
                    cnt++;
            }
            bw.write(String.format("%.3d\n",cnt/tmp.length*100));
        }

        bw.flush();
        bw.close();
    }
}