#include <bits/stdc++.h>
using namespace std;

/*
fact (5)
5 * fact(4)
4 * fact(3)
3 * fact(2)
2 * fact(1) -> return 1
*/

/*
2 * 1  -> fact(1)이 return 1을 반환하니까
3 * 2  -> fact(2)은 2를 반환함
4 * 6  -> fact(3)은 6을 반환함
5 * 24 -> fact(4)는 24를 반환함
fact (5) -> 120
*/
int fact(int n) {
    //cout << n << '\n';
    if (n == 0 || n == 1) return 1;
    return n * fact(n - 1);
}


int fibo(int n) {
    //cout << n << '\n';
    if (n == 0 || n == 1) return 1;
    return fibo(n - 1) + fibo (n - 2);
}

int n = 5;
int main() {
    cout << "fact -> " << fact(n) << " " << "fibo -> " << fibo(n) << '\n';
    return 0;
}

