#include <iostream>
#include <string>
using namespace std;

// Klasa bazowa
class Zwierze {
protected:
    string imie;
    int wiek;

public:
    Zwierze(string imie, int wiek) : imie(imie), wiek(wiek) {}

    void opis() {
        cout << "Zwierze: " << imie << ", Wiek: " << wiek << endl;
    }

    void dzwiek() {
        cout << imie << " wydaje dzwiek." << endl;
    }
};

// Klasa Ssaki
class Ssaki : public Zwierze {
public:
    Ssaki(string imie, int wiek) : Zwierze(imie, wiek) {}

    void opis() {
        cout << "Ssak: " << imie << ", Wiek: " << wiek << endl;
    }

    void dzwiek() {
        cout << imie << " mówi: Raaa!" << endl;
    }
};

// Klasa Ptak
class Ptak : public Zwierze {
public:
    Ptak(string imie, int wiek) : Zwierze(imie, wiek) {}

    void opis() {
        cout << "Ptak: " << imie << ", Wiek: " << wiek << endl;
    }

    void dzwiek() {
        cout << imie << " ćwierka: Tweet-tweet!" << endl;
    }
};

// Klasa Gad
class Gad : public Zwierze {
public:
    Gad(string imie, int wiek) : Zwierze(imie, wiek) {}

    void opis() {
        cout << "Gad: " << imie << ", Wiek: " << wiek << endl;
    }

    void dzwiek() {
        cout << imie << " syczy: Ssss!" << endl;
    }
};


// Program główny
int main() {
    Ssaki tygrys("Tygrys", 5);
    Ptak papuga("Papuga", 2);
    Gad krokodyl("Krokodyl", 7);

    tygrys.opis();
    tygrys.dzwiek();
    cout << endl;

    papuga.opis();
    papuga.dzwiek();
    cout << endl;

    krokodyl.opis();
    krokodyl.dzwiek();

    return 0;
}