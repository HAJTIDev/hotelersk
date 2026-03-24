#include <iostream>
using namespace std;

// Klasa bazowa
class Ksztalt {
public:
    virtual double oblicz_pole() = 0; // metoda czysto wirtualna
    virtual ~Ksztalt() {} // wirtualny destruktor
};

// Klasa Kolo
class Kolo : public Ksztalt {
private:
    double promien;

public:
    Kolo(double r) : promien(r) {}

    double oblicz_pole() override {
        return 3.14159 * promien * promien;
    }
};

// Klasa Kwadrat
class Kwadrat : public Ksztalt {
private:
    double bok;

public:
    Kwadrat(double b) : bok(b) {}

    double oblicz_pole() override {
        return bok * bok;
    }
};

int main() {
    Ksztalt* wsk; // wskaźnik polimorficzny

    Kolo k(5.0);
    Kwadrat kw(4.0);

    wsk = &k;
    cout << "Pole kola: " << wsk->oblicz_pole() << endl;

    wsk = &kw;
    cout << "Pole kwadratu: " << wsk->oblicz_pole() << endl;

    return 0;
}