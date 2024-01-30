package BaekJoon.q10807;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Case1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[] arry = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<n; i++){
            arry[i] = Integer.parseInt(st.nextToken());
        }
//        System.out.println(Arrays.toString(arry));
        int v = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i<n; i++){
            if (arry[i] == v)
                cnt++;
        }
        bw.write(cnt+"\n");

        bw.flush();
        bw.close();
    }
}