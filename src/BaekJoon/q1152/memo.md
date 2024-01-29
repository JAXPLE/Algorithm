# 막힌부분 메모에 작성해놓음..
이거 의외로 새로운걸 배우게 해준 예제임



* Case2에 대한 답변
https://www.acmicpc.net/board/view/111135


처음 문제를 접했을 땐 그냥 split method로 나누고 카운팅하려 했음.. (아래코드 참고)

- **코드**

    ```java
    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.InputStreamReader;
    import java.io.OutputStreamWriter;
    
    public class Main {
        public static void main(Strin**g[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
            String[]tmp = br.readLine().split(" ");
    
            System.out.println(tmp.length);
        }
    }
    ```


여기서 문제가 발생함. ‘띄어쓰기’로 시작하는 문장이라면 바보처럼 ‘띄어쓰기’ 또한 카운팅을 먹여버림..

그래서 여기서부터 ‘띄어쓰기’ 공백찾기를 위해 여러시도를 해봄 char 형변환 , “ “ 직접 따옴표주기 등등 결국 다 실패해서 쌤의 도움을 받음.

도움결과는 위에 **case1** 정답코드임.

하지만 문제의 근본적인 **공백찾기**는 해결되지 않아서 제시된 방법이

이걸로 갈라보라 하심.

[[java] Java의 정규식 표현식, \\ s 대 \\ s + - 리뷰나라](http://daplus.net/java-java%EC%9D%98-%EC%A0%95%EA%B7%9C%EC%8B%9D-%ED%91%9C%ED%98%84%EC%8B%9D-s-%EB%8C%80-s/)

원하는 답변을 정확히 해주심

https://jaxple.notion.site/q1152-3b7eb543abb44c1488ead6fd7e56b262?pvs=4


# 오늘 처음 배운 메서드..

[String.prototype.trim() - JavaScript | MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim)

특정 문자열 변수를 집어 넣으면 문자열의 시작과 끝의 공백을 제거하고 순수 문자열 자체만 반환함. 그래서 문자열 내부 띄어쓰기는 제거되지않음.. 무친;;