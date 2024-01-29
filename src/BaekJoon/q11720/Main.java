package BaekJoon.q11720;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split("");

        for (int i = 0; i < n; i++)
            sum += Integer.parseInt(tmp[i]);

        bw.write(sum+"\n");

        bw.flush();
        bw.close();
    }
}