#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int liczby[n];
    for (int i = 0; i < n; i++)
        cin >> liczby[i];

    int dzielniki[] = {2, 3, 4, 5};
    int wyniki[4] = {0};

    for (int x : liczby) {
        for (int i = 0; i < 4; i++) {
            if (x % dzielniki[i] == 0)
                wyniki[i]++;
        }
    }

    for (int i = 0; i < 4; i++) {
        cout << dzielniki[i] << ":" << wyniki[i] << endl;
    }

    return 0;
}