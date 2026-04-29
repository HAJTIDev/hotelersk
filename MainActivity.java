#include <iostream>
#include <string>

using namespace std;

char getGender(const string& pesel) {
    int digit = pesel[9] - '0';

    if (digit % 2 == 0)
        return 'K';
    else
        return 'M';
}

bool isValidPesel(const string& pesel) {
    int weights[10] = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
    int sum = 0;

    for (int i = 0; i < 10; i++) {
        int digit = pesel[i] - '0';
        sum += digit * weights[i];
    }

    int M = sum % 10;
    int R;

    if (M == 0)
        R = 0;
    else
        R = 10 - M;

    int controlDigit = pesel[10] - '0';

    return R == controlDigit;
}

int main() {
    string pesel;

    cout << "Podaj numer PESEL: ";
    cin >> pesel;

    if (pesel.length() != 11) {
        cout << "Nieprawidlowa dlugosc numeru PESEL!" << endl;
        return 1;
    }

    char gender = getGender(pesel);
    if (gender == 'K')
        cout << "Plec: Kobieta" << endl;
    else
        cout << "Plec: Mezczyzna" << endl;

    if (isValidPesel(pesel))
        cout << "PESEL jest poprawny." << endl;
    else
        cout << "PESEL jest NIEPOPRAWNY." << endl;

    return 0;
}