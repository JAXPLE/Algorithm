package BaekJoon.q1157;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        char result;
        int[] chk = new int[26];
        String tmp = br.readLine();

        for (int i = 0; i < tmp.length(); i++) {
            int pic = 0;
            pic = tmp.charAt(i) - 97;

            if (pic < 0) {//대문자로 판별될 경우
                pic = tmp.charAt(i) - 65;
            }

            chk[pic]++;
        }

        //최댓값구하기 체크
        int max = -1;
        int mIdx = -1;
        for (int i = 0; i < chk.length; i++) {
            if (max < chk[i]) {
                max = chk[i];
                mIdx = i;
            }
        }
        int buc = mIdx + 65;
        result = (char) buc;

        //최댓값 비교
        int cnt = 0;
        for (int i = 0; i < chk.length; i++) {
            if (max == chk[i])
                cnt++;
        }
        if (cnt > 1)
            bw.write("?" + "\n");
        else {
            bw.write(result + "\n");
        }

//            for (int i = 0; i < chk.length; i++) {
//                System.out.printf("%d,[%d]\n", i, chk[i]);
//            }
//            System.out.println(mIdx);

        bw.close();

    }
}