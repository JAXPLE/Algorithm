package BaekJoon.q2675;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();

            int cnt = 0;
            int leng = Integer.parseInt(st.nextToken());
            String tmp = st.nextToken();
            for (int j = 0; j < tmp.length(); j++) {//숫자 선택이고
                for (int h = 0; h <leng; h++) {//숫자 붙이기
                    sb.append(tmp.charAt(j));
                }
            }
            System.out.println(sb);
        }

    }
}
/*
2
3 ABC
5 /HTP
*/