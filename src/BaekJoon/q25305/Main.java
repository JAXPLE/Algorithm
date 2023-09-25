package BaekJoon.q25305;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//        input
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[]grade = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < grade.length; i++)
            grade[i] = Integer.parseInt(st.nextToken());

//        sorting
        for (int i = 0; i < grade.length; i++) {
            int index = i;

            for (int j = index; j < grade.length; j++)
                if (grade[index] > grade[j]) {
                    index = j;
                }

            int temp = grade[i];
            grade[i] = grade[index];
            grade[index] = temp;
        }
//        Arrays.sort(grade);

//        System.out.println(Arrays.toString(grade));
        System.out.println(grade[n - k]);

        br.close();
    }
}