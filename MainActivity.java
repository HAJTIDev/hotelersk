#include <iostream>
#include <string>
using namespace std;

// Klasa bazowa
class Osoba {
protected:
    string imie;
    string nazwisko;
    string pesel;

public:
    // Konstruktor
    Osoba(string imie, string nazwisko, string pesel)
        : imie(imie), nazwisko(nazwisko), pesel(pesel) {}

    // Metoda do wyświetlania danych
    virtual void wyswietl() const {
        cout << "Imię: " << imie << endl;
        cout << "Nazwisko: " << nazwisko << endl;
        cout << "PESEL: " << pesel << endl;
    }
};

// Klasa pochodna
class Student : public Osoba {
private:
    string uczelnia;
    string wydzial;
    int rok_studiow;

public:
    // Konstruktor klasy pochodnej
    Student(string imie, string nazwisko, string pesel,
            string uczelnia, string wydzial, int rok_studiow)
        : Osoba(imie, nazwisko, pesel),
          uczelnia(uczelnia), wydzial(wydzial), rok_studiow(rok_studiow) {}

    // Nadpisanie metody wyswietl()
    void wyswietl() const override {
        Osoba::wyswietl();
        cout << "Uczelnia: " << uczelnia << endl;
        cout << "Wydział: " << wydzial << endl;
        cout << "Rok studiów: " << rok_studiow << endl;
    }
};

int main() {
    Student s("Jan", "Kowalski", "99010112345", "Politechnika Warszawska", "Informatyka", 2);

    cout << "--- Dane studenta ---" << endl;
    s.wyswietl();

    return 0;
}