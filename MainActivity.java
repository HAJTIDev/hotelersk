#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int liczba;
    int podzielne2 = 0, podzielne3 = 0, podzielne4 = 0, podzielne5 = 0;

    for (int i = 0; i < n; i++) {
        cin >> liczba;
        if (liczba % 2 == 0) podzielne2++;
        if (liczba % 3 == 0) podzielne3++;
        if (liczba % 4 == 0) podzielne4++;
        if (liczba % 5 == 0) podzielne5++;
    }

    cout << "2:" << podzielne2 << endl;
    cout << "3:" << podzielne3 << endl;
    cout << "4:" << podzielne4 << endl;
    cout << "5:" << podzielne5 << endl;

    return 0;
}