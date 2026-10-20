#include <iostream>
#include <string>

using namespace std;

//******************************************************
// nazwa klasy: Film
// pola:        tytul - przechowuje tytuł filmu
//              liczbaWypozyczen - przechowuje liczbę wypożyczeń
// metody:      ustawTytul, void - ustawia tytuł filmu
//              pobierzTytul, string - zwraca tytuł filmu
//              pobierzLiczbeWypozyczen, int - zwraca liczbę wypożyczeń
//              inkrementujWypozyczenia, void - zwiększa liczbę wypożyczeń o 1
// informacje:  Klasa reprezentuje film w wirtualnej wypożyczalni
// autor:       <Twój numer PESEL>
//******************************************************
class Film {
protected:
    string tytul;
    int liczbaWypozyczen;

public:
    Film() {
        tytul = "";
        liczbaWypozyczen = 0;
    }

    void ustawTytul(string nowyTytul) {
        if (nowyTytul.length() > 20) {
            tytul = nowyTytul.substr(0, 20);
        } else {
            tytul = nowyTytul;
        }
    }

    string pobierzTytul() {
        return tytul;
    }

    int pobierzLiczbeWypozyczen() {
        return liczbaWypozyczen;
    }

    void inkrementujWypozyczenia() {
        liczbaWypozyczen++;
    }
};

int main() {
    // 1. Inicjalizacja obiektu i wyświetlenie zawartości jego pól
    Film film;
    cout << "--- Po inicjalizacji obiektu ---" << endl;
    cout << "Tytul filmu: \"" << film.pobierzTytul() << "\"" << endl;
    cout << "Liczba wypozyczen: " << film.pobierzLiczbeWypozyczen() << endl << endl;

    // 2. Test działania metody set
    film.ustawTytul("Interstellar");

    // 3. Test działania metody get
    cout << "--- Test metod set oraz get ---" << endl;
    cout << "Ustawiony tytul filmu: " << film.pobierzTytul() << endl << endl;

    // 4. Test metody inkrementacji (przed i po)
    cout << "--- Test metody inkrementacji ---" << endl;
    cout << "Liczba wypozyczen przed inkrementacja: " << film.pobierzLiczbeWypozyczen() << endl;
    film.inkrementujWypozyczenia();
    cout << "Liczba wypozyczen po inkrementacji: " << film.pobierzLiczbeWypozyczen() << endl;

    return 0;
}
