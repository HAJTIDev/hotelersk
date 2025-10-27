#include <iostream>
using namespace std;

int main() {
    int n;
    if (!(cin >> n)) return 0; // brak danych
    int cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0;
    for (int i = 0; i < n; ++i) {
        long long x;
        cin >> x;
        if (x % 2 == 0) ++cnt2;
        if (x % 3 == 0) ++cnt3;
        if (x % 4 == 0) ++cnt4;
        if (x % 5 == 0) ++cnt5;
    }

    cout << "2:" << cnt2 << '\n';
    cout << "3:" << cnt3 << '\n';
    cout << "4:" << cnt4 << '\n';
    cout << "5:" << cnt5 << '\n';

    return 0;
}