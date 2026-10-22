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
