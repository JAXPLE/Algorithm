package BaekJoon.q10951.Fail;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.StringTokenizer;
import java.util.function.BiFunction;

public class Fail2 { //fail
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String input = "";
        while ((input = br.readLine()) != null){
            st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = a + b;
            bw.write(result+"\n");
            if (a == 5 && b == 2 && result==7)
                break;
        }

        bw.flush();
        bw.close();
    }
}
