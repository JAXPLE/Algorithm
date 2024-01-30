package BaekJoon.q3052;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[]arr =  new int[10];
        int[]chk = new int[42];

        for (int i = 0; i<arr.length; i++){

            arr[i] = Integer.parseInt(br.readLine())%42;
            chk[arr[i]] ++;
        }
        int cnt = 0;
        for (int i = 0; i < chk.length; i++) {
            if (chk[i] != 0)
                cnt++;
        }
//        System.out.println(Arrays.toString(chk));

        bw.write(cnt+"\n");

        bw.flush();
        bw.close();
    }
}