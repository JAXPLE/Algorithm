package BaekJoon.q10809;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] chk = new int[26];
        for (int i = 0; i < chk.length; i++) {
            chk[i] = -1;
        }

        String arr = br.readLine();

        int tmp;
        for (int i = 0; i < arr.length(); i++) {
            tmp = arr.charAt(i)-97;
            for (int j = 0; j < chk.length; j++) {
                if (chk[tmp] == -1){
                    chk[tmp] = i;
                    break;
                }
            }
//            System.out.println(tmp);
        }

        for (int i = 0; i < chk.length; i++) {
            bw.write(String.format("%d ",chk[i]));
        }

        bw.flush();
        bw.close();
    }
}