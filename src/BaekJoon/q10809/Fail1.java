package BaekJoon.q10809;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Fail1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] chk = new int[25];
        for (int i = 0; i < chk.length; i++) {
            chk[i] = -1;
        }

        String arr = br.readLine();

        int tmp;
        int cnt = 0;
        for (int i = 0; i < arr.length(); i++) {
            tmp = arr.charAt(i)-97;
            for (int j = 0; j < chk.length; j++) {
                chk[tmp] = cnt++;
                break;
            }
        }
        bw.write(Arrays.toString(chk)+"\n");

        bw.flush();
        bw.close();
    }
}