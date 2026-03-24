#include <iostream>
using namespace std;

void sort3(int *a, int *b, int *c) {
    int temp;

    if (*a > *b) {
        temp = *a;
        *a = *b;
        *b = temp;
    }

    if (*a > *c) {
        temp = *a;
        *a = *c;
        *c = temp;
    }

    if (*b > *c) {
        temp = *b;
        *b = *c;
        *c = temp;
    }
}

int main() {
    int x, y, z;

    cout << "Podaj trzy liczby: ";
    cin >> x >> y >> z;

    sort3(&x, &y, &z);

    cout << "Posortowane: " << x << " " << y << " " << z << endl;

    return 0;
}