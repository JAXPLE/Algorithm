package BaekJoon.q5597;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[]chk = new boolean[30];
        for (int i = 0; i<28; i++){
            int tmp = Integer.parseInt(br.readLine())-1;
            chk[tmp] = true;
        }
//        System.out.println(Arrays.toString(chk));

        for (int i = 0; i<chk.length; i++)
            if (!chk[i])
                bw.write(i+1+"\n");

        bw.flush();
        bw.close();
    }
}