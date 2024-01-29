package BaekJoon.q5622.Fail;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fail4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String tmp = br.readLine();

        for (int i = 0; i < tmp.length(); i++) {
            int tmpChar = tmp.charAt(i);
            int tmpIdx = (tmpChar-'A')/3+2;

            if (tmpChar >= 'P' && tmpChar <= 'S'){
                System.out.println(tmpChar);
            }
            else if (tmpChar >= 'W' && tmpChar <= 'Z'){
                System.out.println(tmpChar);
            }
            System.out.printf("%c",i+'A');
            System.out.println(tmpIdx);
            System.out.println();
        }

        bw.close();
    }
}

//ABCDEFGHIJKLMNOPQRSTUVWXYZ