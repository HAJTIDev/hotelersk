#include <iostream>
#include <string>
#include <vector>
#include <cstdlib>
#include <ctime>

class Kosc {
public:
    // Pole statyczne przechowujące liczbę instancji
    static int liczbaInstancji;

    // Pola ogólnodostępne
    std::vector<std::string> nazwyPlikow = {
        "kosc0.png", "kosc1.png", "kosc2.png", "kosc3.png", 
        "kosc4.png", "kosc5.png", "kosc6.png"
    };
    int liczbaOczek;
    int idPliku;
    bool czyDostepna;

    // Konstruktor jednoargumentowy
    Kosc(int wartosc) {
        if (wartosc < 1 || wartosc > 6) {
            wartosc = 0;
        }
        liczbaOczek = wartosc;
        idPliku = wartosc;
        czyDostepna = true;
        liczbaInstancji++;
    }

    // Konstruktor bezargumentowy
    Kosc() {
        int wylosowana = (std::rand() % 6) + 1;
        liczbaOczek = wylosowana;
        idPliku = wylosowana;
        czyDostepna = true;
        liczbaInstancji++;
    }

    // Metoda realizująca rzut kością (tylko gdy kość jest dostępna)
    void rzucKosc() {
        if (czyDostepna) {
            int wylosowana = (std::rand() % 6) + 1;
            liczbaOczek = wylosowana;
            idPliku = wylosowana;
        }
    }

    // Metoda blokująca kość
    void zablokujKosc() {
        czyDostepna = false;
    }

    // Metoda zwracająca wartość wyrzuconą w postaci słownej
    std::string pobierzWartoscTekstowo() const {
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
};

// Inicjalizacja składowej statycznej
int Kosc::liczbaInstancji = 0;

int main() {
    // Inicjalizacja generatora liczb pseudolosowych
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
