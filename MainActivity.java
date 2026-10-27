#include "Kosc.h"
#include <cstdlib>

// Inicjalizacja składowej statycznej
int Kosc::liczbaInstancji = 0;

// Konstruktor jednoargumentowy
Kosc::Kosc(int wartosc) 
    : nazwyPlikow{"kosc0.png", "kosc1.png", "kosc2.png", "kosc3.png", "kosc4.png", "kosc5.png", "kosc6.png"} 
{
    if (wartosc < 1 || wartosc > 6) {
        wartosc = 0;
    }
    liczbaOczek = wartosc;
    idPliku = wartosc;
    czyDostepna = true;
    liczbaInstancji++;
}

// Konstruktor bezargumentowy
Kosc::Kosc() 
    : nazwyPlikow{"kosc0.png", "kosc1.png", "kosc2.png", "kosc3.png", "kosc4.png", "kosc5.png", "kosc6.png"} 
{
    int wylosowana = (std::rand() % 6) + 1;
    liczbaOczek = wylosowana;
    idPliku = wylosowana;
    czyDostepna = true;
    liczbaInstancji++;
}

// Rzut kością, tylko gdy jest dostępna
void Kosc::rzucKosc() {
    if (czyDostepna) {
        int wylosowana = (std::rand() % 6) + 1;
        liczbaOczek = wylosowana;
        idPliku = wylosowana;
    }
}

// Blokowanie kości
void Kosc::zablokujKosc() {
    czyDostepna = false;
}

// Zwracanie wartości w postaci słownej
std::string Kosc::pobierzWartoscTekstowo() const {
    switch (liczbaOczek) {
        case 1: return "jeden";
        case 2: return "dwa";
        case 3: return "trzy";
        case 4: return "cztery";
        case 5: return "pięć";
        case 6: return "sześć";
        default: return "zero";
    }
}
