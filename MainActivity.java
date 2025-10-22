#include <iostream>
#include <fstream>  // biblioteka do obsługi plików
#include <string>   // do użycia klasy std::string

int main() {
    std::string filename = "tekst.txt";  // nazwa pliku do odczytania
    std::ifstream file(filename);        // tworzymy strumień plikowy do odczytu

    // Sprawdzamy, czy udało się otworzyć plik
    if (!file.is_open()) {
        std::cerr << "Nie udalo sie otworzyc pliku: " << filename << std::endl;
        return 1;  // zakończ program z błędem
    }

    std::string line;  // zmienna do przechowywania pojedynczej linijki
    std::cout << "Zawartosc pliku '" << filename << "':\n";

    // Czytamy plik linijka po linijce
    while (std::getline(file, line)) {
        std::cout << line << std::endl;
    }

    file.close();  // zamykamy plik po zakończeniu odczytu
    return 0;      // zakończenie programu bez błędów
}