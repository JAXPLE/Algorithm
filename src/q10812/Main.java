package q10812;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[]arr = new int[n];
        int[]tmp = new int[n];
        for (int i = 0; i < tmp.length; i++){
            arr[i] = i+1;
            tmp[i] = arr[i];
        }

        n = Integer.parseInt(st.nextToken());
        while (n > 0) {

            st = new StringTokenizer(br.readLine());
            int begin = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;
            int mid = Integer.parseInt(st.nextToken())-1;

            for (int i = 0; i < tmp.length; i++){
                tmp[i] = arr[i];
            }

            if (begin != mid){
                int cnt = begin;
                for (int i = mid; i <= end; i++) {
                    arr[cnt++] = tmp[i];
                }
                for (int i = begin; i < mid; i++) {
                    arr[cnt++] = tmp[i];
                }
//                System.out.println(Arrays.toString(arr));
            }
            n--;
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]+" ");
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(sb);
    }
}