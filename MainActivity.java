#pragma once
#include <string>
#include <vector>

class Kosc {
public:
    // Pole statyczne zliczające instancje
    static int liczbaInstancji;

    // Pola ogólnodostępne
    std::vector<std::string> nazwyPlikow;
    int liczbaOczek;
    int idPliku;
    bool czyDostepna;

    // Konstruktory
    Kosc(int wartosc);
    Kosc();

    // Metody
    void rzucKosc();
    void zablokujKosc();
    std::string pobierzWartoscTekstowo() const;
};
