#include <iostream>
#include "Nagłówek.h"

using namespace std;

int main() {
    Film film;

    cout << "--- TESTY W KONSOLI ---" << endl;

    // 1. Inicjalizacja obiektu i wyświetlenie zawartości pól
    cout << "Stan poczatkowy:" << endl;
    cout << "Tytul: " << film.getTytul() << endl;
    cout << "Liczba wypozyczen: " << film.getLiczbaWypozyczen() << endl;

    // 2. Test działania metody set oraz get
    film.setTytul("Incepcja");
    cout << "\nPo ustawieniu tytulu na 'Incepcja':" << endl;
    cout << "Pobrany tytul (get): " << film.getTytul() << endl;

    // 3. Test metody inkrementacji (przed i po)
    cout << "\nTest inkrementacji:" << endl;
    cout << "Liczba wypozyczen przed: " << film.getLiczbaWypozyczen() << endl;
    film.inkrementujLiczbeWypozyczen();
    cout << "Liczba wypozyczen po: " << film.getLiczbaWypozyczen() << endl;

    return 0;
}
