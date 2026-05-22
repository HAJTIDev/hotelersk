Założenia aplikacji:
Aplikacja składa się z jednego komponentu.
Danymi komponentu jest tablica z nazwami kursów, o elementach: "Programowanie w C#", "Angular dla początkujących", "Kurs Django". Dla uproszczenia tablica może być zdefiniowana jako pole komponentu. Należy założyć, że tablica w przyszłości może się zmienić, co będzie miało wpływ na zachowanie i wygląd aplikacji.
Komponent wyświetla:
Nagłówek drugiego stopnia o treści: „Liczba kursów: <liczba>”, gdzie <liczba> oznacza wielkość tablicy z nazwami kursów.
Listę numerowaną generowaną automatycznie dla wszystkich elementów tablicy, niezależnie od jej wymiaru.
Formularz składający się z:
pola edycyjnego i jego etykiety o treści „Imię i nazwisko:”
edycyjnego pola numerycznego i jego etykiety o treści „Numer kursu:”
przycisku „Zapisz do kursu”
Aplikacja w stanie początkowym wyświetla puste pola formularza.
Elementy formularza są formatowane zgodnie z obrazem 1a lub 1b za pomocą stylów biblioteki Bootstrap. Do budowy szablonu HTML należy wykorzystać pomoc zamieszczoną w Tabeli 1. Należy stosować znaczące nazwy dla identyfikatorów pól formularza.
Po wybraniu przycisku formularza jest generowane zdarzenie zatwierdzenia formularza, które wyświetla w konsoli przeglądarki:
Wartość wpisaną w pierwszym polu formularza.
Nazwę kursu odpowiadającą numerowi wpisanemu w drugie pole formularza, gdy kurs o takim numerze istnieje. W przeciwnym wypadku wyświetla komunikat „Nieprawidłowy numer kursu”.
Aplikacja powinna być zapisana czytelnie, z zachowaniem zasad czystego formatowania kodu, należy stosować znaczące nazwy zmiennych i funkcji.
Dokumentacja do programu wykonana zgodnie z wytycznymi z części III zadania egzaminacyjnego.
Kod aplikacji przygotuj do nagrania na płytę. W podfolderze web powinno znaleźć się archiwum całego projektu o nazwie web.zip oraz pliki z kodem źródłowym, które były modyfikowane.