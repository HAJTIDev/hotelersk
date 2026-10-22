/////// Naglowek.h ///////
#pragma once
#include <string>

class Film {
protected:
    std::string tytul = "";
    int liczbaWypozyczen = 0;
public:
    void setTytul(std::string tytulFilmu) {
        if (tytulFilmu.length() <= 20) {
            tytul = tytulFilmu;
        }
    }
    
    std::string getTytul() {
        return tytul;
    }
    
    int getLiczbaWypozyczen() {
        return liczbaWypozyczen;
    }
    
    void inkrementujLiczbeWypozyczen() {
        liczbaWypozyczen++;
    }
};

/////// film2.cpp ///////
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

/////// UnitTestFilm2.cpp ///////
#include "pch.h"
#include "CppUnitTest.h"
#include "Naglowek.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace UnitTestFilm2
{
	TEST_CLASS(UnitTestFilm2)
	{
	public:
		
		TEST_METHOD(TestTytultFilmu)
		{
			Film film;
			Assert::IsTrue(film.getTytul() == "");

			film.setTytul("Avatar");
			Assert::IsTrue(film.getTytul() == "Avatar");
		}

		TEST_METHOD(TestOgraniczeniaDlugosciTytulu)
		{
			Film film;
			film.setTytul("12345678901234567890"); 
			Assert::IsTrue(film.getTytul() == "12345678901234567890");

			film.setTytul("To jest zdecydowanie za dlugi tytul filmu");
			Assert::IsTrue(film.getTytul() == "12345678901234567890");
		}

		TEST_METHOD(TestInkrementacji)
		{
			Film film;
			Assert::AreEqual(0, film.getLiczbaWypozyczen());

			film.inkrementujLiczbeWypozyczen();

			Assert::AreEqual(1, film.getLiczbaWypozyczen());
		}
	};
}
