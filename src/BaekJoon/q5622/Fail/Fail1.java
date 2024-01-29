package BaekJoon.q5622.Fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fail1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String tmp = br.readLine();

            String run = "";
            for (int i = 0; i < tmp.length(); i++) {
                char tmp2 = tmp.charAt(i);
                int j=0;
                String tmp3 = "O";
                if (tmp2+"".compareTo(tmp3) > 0)
                    j++;

                int position = (tmp2 - 'A') / (3+j) + 2;
                System.out.println(position);
                System.out.println(j);
                System.out.println(tmp2+"".compareTo("O"));
            }
        }
//        bw.close();
    }
}