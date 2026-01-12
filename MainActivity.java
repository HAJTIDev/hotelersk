#include <iostream>
using namespace std;

int main() {
    char a, b;
    cin >> a >> b;

    int x, y;

    // pierwszy znak
    if (a >= '0' && a <= '9')
        x = a - '0';
    else
        x = a - 'A' + 10;

    // drugi znak
    if (b >= '0' && b <= '9')
        y = b - '0';
    else
        y = b - 'A' + 10;

    int ascii = x * 16 + y;

    cout << ascii << endl;
    cout << char(ascii) << endl;

    return 0;
}