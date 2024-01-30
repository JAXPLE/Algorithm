package BaekJoon.q2439;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int turn = Integer.parseInt(br.readLine());
        for (int i = 0; i<turn; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.format("Case #%d: %d + %d = %d\n",i+1,a,b,a+b));
        }
        bw.flush();
        bw.close();
    }
}