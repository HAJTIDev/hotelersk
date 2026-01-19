#include <iostream>
using namespace std;

class Calculator {
public:
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            cout << "Blad: dzielenie przez zero!" << endl;
            return 0;
        }
        return a / b;
    }
};

int main() {
    Calculator calc;
    double a, b;
    int choice;

    cout << "Podaj pierwsza liczbe: ";
    cin >> a;
    cout << "Podaj druga liczbe: ";
    cin >> b;

    cout << "\nWybierz operacje:\n";
    cout << "1. Dodawanie\n";
    cout << "2. Odejmowanie\n";
    cout << "3. Mnozenie\n";
    cout << "4. Dzielenie\n";
    cout << "Twoj wybor: ";
    cin >> choice;

    switch (choice) {
        case 1:
            cout << "Wynik: " << calc.add(a, b);
            break;
        case 2:
            cout << "Wynik: " << calc.subtract(a, b);
            break;
        case 3:
            cout << "Wynik: " << calc.multiply(a, b);
            break;
        case 4:
            cout << "Wynik: " << calc.divide(a, b);
            break;
        default:
            cout << "Nieprawidlowy wybor!";
    }

    return 0;
}