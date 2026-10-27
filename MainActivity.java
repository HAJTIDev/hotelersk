#include <iostream>
#include <cstdlib>
#include <ctime>
#include "Kosc.h"

int main() {
    std::srand(static_cast<unsigned int>(std::time(nullptr)));

    std::cout << "=== TWORZENIE OBIEKTU 1 (konstruktor bezargumentowy) ===\n";
    Kosc kosc1;
    std::cout << "Liczba utworzonych instancji: " << Kosc::liczbaInstancji << "\n";
    std::cout << "Liczba oczek: " << kosc1.liczbaOczek << " (" << kosc1.pobierzWartoscTekstowo() << ")\n";
    std::cout << "Nazwa pliku graficznego: " << kosc1.nazwyPlikow[kosc1.idPliku] << "\n\n";

    std::cout << "=== TWORZENIE OBIEKTU 2 (konstruktor jednoargumentowy) ===\n";
    int podanaWartosc;
    std::cout << "Podaj liczbe oczek dla kosci (1-6): ";
    std::cin >> podanaWartosc;

    Kosc kosc2(podanaWartosc);
    std::cout << "Liczba utworzonych instancji: " << Kosc::liczbaInstancji << "\n";
    std::cout << "Liczba oczek: " << kosc2.liczbaOczek << " (" << kosc2.pobierzWartoscTekstowo() << ")\n";
    std::cout << "Nazwa pliku graficznego: " << kosc2.nazwyPlikow[kosc2.idPliku] << "\n";

    return 0;
}
