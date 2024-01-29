package BaekJoon.q2908;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tmp = br.readLine().split(" ");

        String a = "";
        String b = "";
        for (int i = 0; i < tmp.length; i++) {
            char[]tmp2 = new char[tmp[i].length()];
            for (int j = 0; j < tmp[i].length(); j++) {
                tmp2[j] = tmp[i].charAt(j);
            }
//            System.out.println(Arrays.toString(tmp2));
            char tmp3 = tmp2[0];
            tmp2[0] = tmp2[2];
            tmp2[2] = tmp3;

            for (int j = 0; j < tmp[i].length(); j++) {
                if (i == 0)
                    a += tmp2[j]+"";
                else
                    b += tmp2[j]+"";
            }
        }

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);

        if (c > d)
            bw.write(c+"\n");
        else
            bw.write(d+"\n");

        bw.close();
    }
}