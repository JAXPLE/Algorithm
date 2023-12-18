#include <bits/stdc++.h>
using namespace std;

/*
*/

int main() {
    // int arr[] = {1,2,3};
    vector<int> arr = {1,2,3};
    // sort(array.begin(),arr.end());
    do {
        for (int i : arr)
            cout << i << " ";
        cout << '\n';
    } while (next_permutation(arr.begin(), arr.end()));//&arr[0],&arr[0] + 3));
}

