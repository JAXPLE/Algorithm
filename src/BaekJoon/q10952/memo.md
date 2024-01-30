```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        long start = System.currentTimeMillis(); //시간확인 시작
        int turn = Integer.parseInt(br.readLine());
        for (int i = 0; i < turn; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        long end = System.currentTimeMillis(); //시간확인 종료
        bw.write(end-start+""); //시간확인
        bw.flush();
        bw.close();

    }
}
```