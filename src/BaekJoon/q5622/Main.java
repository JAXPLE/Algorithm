package BaekJoon.q5622;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String tmp = br.readLine();
        String[] dial = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int timer = 0;

        for (int i = 0; i < tmp.length(); i++) {
            int idx = -1;
            char tmpChar = tmp.charAt(i);
            for (int j = 0; j < dial.length; j++) {
                if (dial[j].contains(tmpChar+"")){
                    idx = j+2;
                    break;
                }
            }
//            System.out.println(idx);
            timer += idx+1;
        }
        bw.write(timer+"");
        bw.close();
    }
}

//ABCDEFGHIJKLMNOPQRSTUVWXYZ