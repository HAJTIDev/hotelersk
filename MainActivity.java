#include "pch.h"
#include "CppUnitTest.h"
#include "../film/Nagłówek.h"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace UnitTest1film
{
	TEST_CLASS(UnitTest1film)
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
			// Tytuł mający dokładnie lub mniej niż 20 znaków powinien przejść
			film.setTytul("12345678901234567890"); 
			Assert::IsTrue(film.getTytul() == "12345678901234567890");

			// Tytuł dłuższy niż 20 znaków nie powinien nadpisać wartości początkowej
			film.setTytul("To jest zdecydowanie za dlugi tytul filmu");
			Assert::IsTrue(film.getTytul() == "12345678901234567890");
		}

		TEST_METHOD(TestInkrementacji)
		{
			Film film;
			Assert::AreEqual(
				0, film.getLiczbaWypozyczen()
			);

			film.inkrementujLiczbeWypozyczen();

			Assert::AreEqual(
				1, film.getLiczbaWypozyczen()
			);
		}
	};
}
