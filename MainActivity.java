#include <iostream>
using namespace std;

int main() {
    long long x, y;
    cin >> x >> y;

    string wynik;

    if (x == 0 && y == 0) wynik = "0";
    else if (x == 0) wynik = "OY";
    else if (y == 0) wynik = "OX";
    else if (y > 0) wynik = (x > 0 ? "I" : "II");
    else wynik = (x < 0 ? "III" : "IV");

    cout << wynik;
    return 0;
}