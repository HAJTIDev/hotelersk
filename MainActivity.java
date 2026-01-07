#include <iostream>
using namespace std;

// Definicja klasy Uczen
class Uczen {
public:
    // Statyczne zmienne klasowe
    static string s_klasa;
    static string s_zawod;

    // Funkcja wyświetlająca dane
    void wyswietlDane();
};

// Inicjalizacja zmiennych klasowych
string Uczen::s_klasa = "2a";
string Uczen::s_zawod = "technik programista";

// Definicja funkcji
void Uczen::wyswietlDane() {
    cout << "Klasa: " << s_klasa << endl;
    cout << "Zawod: " << s_zawod << endl;
}

int main() {
    Uczen uczen1;

    // Wyświetlenie początkowych wartości
    uczen1.wyswietlDane();

    cout << endl;

    // Zmiana wartości zmiennych klasowych
    Uczen::s_klasa = "3b";
    Uczen::s_zawod = "technik informatyk";

    // Ponowne wyświetlenie
    uczen1.wyswietlDane();

    return 0;
}