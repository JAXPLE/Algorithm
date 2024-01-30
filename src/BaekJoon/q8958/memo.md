```java
int cnt = 0;
int idxCnt = 0;
for (int i = 0; i<tmp[idxCnt].length(); i++){
    System.out.println(tmp[idxCnt++].charAt(i));
    if (tmp[idxCnt].charAt(i) == 'O')
        cnt++;
    else
        cnt = 0;

    result += String.valueOf(cnt)+"\n";
}
```