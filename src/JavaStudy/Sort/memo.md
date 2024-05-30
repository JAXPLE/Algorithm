Comparator 로 정렬에 대한 기준점을 제시함.
x 를 기준으로 오름차순 할것인가?
y 를 기준으로 오름차순 할것인가?

기준을 제시하고 해당 stream 의 sorting 함수에 인자로 Overriding 된 객체를 인자로 먹인다.
```
//1
comparatorUserArr.sort((a,b) -> Integer.compare(a.getAge(), b.getAge()));
comparatorUserArr.sort((a,b) -> Integer.compare(b.getAge(), a.getAge()));

//2
Collections.sort(comparatorUserArr, userComparator);
```
