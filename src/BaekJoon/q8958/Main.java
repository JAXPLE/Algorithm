package BaekJoon.q8958;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
        문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
        예를 들어, 10번 문제의 점수는 3이 된다.
        "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
        OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String result = ""; //점수저장용

        String[] tmp = new String[n];
        for (int i = 0; i<n; i++){
            int cnt = 0;
            int sum = 0;
            tmp[i] = br.readLine();
            for (int j = 0; j<tmp[i].length(); j++){
                if (tmp[i].charAt(j) == 'O')
                    cnt++;
                else
                    cnt = 0;

                sum+=cnt;
            }
            result += String.valueOf(sum)+"\n";
        }


        bw.write(result+"\n");

        bw.flush();
        bw.close();
    }
}