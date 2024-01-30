package BaekJoon.q10818;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        /*9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를
        구하는 프로그램을 작성하시오.
        예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61
        이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[]tmp = new int[9];
        for (int i = 0; i<tmp.length; i++)
            tmp[i] = Integer.parseInt(br.readLine());

        int idx = -1;
        int max = -1;
        for (int i = 0; i<tmp.length; i++){
            if (tmp[i] > max){
                max = tmp[i];
                idx = i+1;
            }
        }
//        System.out.println(Arrays.toString(tmp));
//        System.out.println(max + " " + idx);
        bw.write(max+"\n"+idx);
        bw.flush();
        bw.close();
    }
}