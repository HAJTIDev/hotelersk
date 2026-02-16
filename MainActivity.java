#include <iostream>
#include <string>

class Student {
private:
    std::string imie;
    int wiek;
    double* srednia;

public:
    // Konstruktor zwykły
    Student(const std::string& imie, int wiek, double srednia)
        : imie(imie), wiek(wiek)
    {
        this->srednia = new double(srednia);
    }

    // Konstruktor kopiujący (deep copy)
    Student(const Student& other)
        : imie(other.imie), wiek(other.wiek)
    {
        this->srednia = new double(*(other.srednia));
    }

    // Destruktor
    ~Student() {
        delete srednia;
    }

    // Setter
    void setSrednia(double nowaSrednia) {
        *srednia = nowaSrednia;
    }

    // Metoda wyświetlająca
    void pokaz() const {
        std::cout << "Imie: " << imie
                  << ", Wiek: " << wiek
                  << ", Srednia: " << *srednia
                  << std::endl;
    }
};

int main() {
    Student s1("Jan", 20, 4.5);

    // Wywołanie konstruktora kopiującego
    Student s2 = s1;

    // Zmiana danych w drugim obiekcie
    s2.setSrednia(3.0);

    std::cout << "Student 1:" << std::endl;
    s1.pokaz();

    std::cout << "Student 2:" << std::endl;
    s2.pokaz();

    return 0;
}