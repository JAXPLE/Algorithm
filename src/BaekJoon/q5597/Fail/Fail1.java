package BaekJoon.q5597.Fail;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Fail1 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[]chk = new boolean[30];
        for (int i = 0; i<30; i++){
            String tmp = br.readLine();
            if (!(tmp.equals(""))){
                chk[Integer.parseInt(tmp)-1] = true;
            }
        }
//        System.out.println(Arrays.toString(chk));

        for (int i = 0; i<chk.length; i++)
            if (!chk[i])
                System.out.println(i+1);

        bw.flush();
        bw.close();
    }
}