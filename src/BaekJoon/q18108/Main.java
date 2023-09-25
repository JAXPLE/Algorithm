package BaekJoon.q18108;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cap = 2541 - 1998;
        System.out.println(Integer.parseInt(br.readLine()) - cap);
        br.close();
    }
}