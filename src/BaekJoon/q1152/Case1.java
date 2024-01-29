package BaekJoon.q1152;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Case1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String in = br.readLine(); //String input
//        System.out.println(in);

        StringTokenizer st = new StringTokenizer(in, " ");
//        토크니저를 활용하여 띄어쓰기 기준으로 잘라보관.

        int endCnt = 0;
        int cnt = st.countTokens();// cnt variable에 토큰의 개수를 저장.
        while(cnt > 0) { //토큰이 모두 소진될때가지 반복
//            System.out.println(st.nextToken());
            cnt--;
            endCnt++;
        }
        bw.write(endCnt+"\n");
        bw.close();
    }
}