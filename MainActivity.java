#include <iostream>
#include "Naglowek.h"

using namespace std;

int main() {
    Film film;

    cout << "--- TESTY W KONSOLI ---" << endl;
    cout << "Stan poczatkowy:" << endl;
    cout << "Tytul: " << film.getTytul() << endl;
    cout << "Liczba wypozyczen: " << film.getLiczbaWypozyczen() << endl;

    film.setTytul("Incepcja");
    cout << "\nPo ustawieniu tytulu na 'Incepcja':" << endl;
    cout << "Pobrany tytul (get): " << film.getTytul() << endl;

    cout << "\nTest inkrementacji:" << endl;
    cout << "Przed: " << film.getLiczbaWypozyczen() << endl;
    film.inkrementujLiczbeWypozyczen();
    cout << "Po: " << film.getLiczbaWypozyczen() << endl;

    return 0;
}
