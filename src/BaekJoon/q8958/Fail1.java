package BaekJoon.q8958;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Fail1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[]arr =  new int[10];

        for (int i = 0; i<arr.length; i++){
            int tmp = Integer.parseInt(br.readLine())%42;
            arr[i] = tmp;
        }
//        System.out.println(Arrays.toString(arr));

        int result = 0;
        for (int i = 0; i<arr.length; i++){
            int cnt = 0;
            for (int j = 0; j<arr.length; j++){
                if (arr[i] == arr[j])
                    cnt++;
            }
            if (cnt > 1)
                result++;
        }
        System.out.println(result);

        bw.flush();
        bw.close();
    }
}