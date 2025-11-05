fun main() {
    while (true) {
        println("\n===== MENU ZALICZENIA: Podstawy programowania w Kotlinie =====")
        println("1. Zadanie 1 – Deklaracja zmiennych i typy danych")
        println("2. Zadanie 2 – Funkcja i operatory arytmetyczne")
        println("3. Zadanie 3 – Instrukcja warunkowa: Ocena z egzaminu")
        println("4. Zadanie 4 – Klasa Prostokąt i metoda obliczPole()")
        println("5. Zadanie 5 – Klasa Student i obliczanie średniej ocen")
        println("0. Wyjście z programu")
        print("Wybierz numer zadania: ")

        when (readLine()?.toIntOrNull()) {
            1 -> zadanie1()
            2 -> zadanie2()
            3 -> zadanie3()
            4 -> zadanie4()
            5 -> zadanie5()
            0 -> {
                println("Koniec programu. Powodzenia na zaliczeniu! 👋")
                return
            }
            else -> println("Niepoprawny wybór. Spróbuj ponownie.")
        }
    }
}

// ===================== ZADANIE 1 =====================
fun zadanie1() {
    println("\n--- Zadanie 1: Deklaracja zmiennych i typy danych ---")
    val imie: String = "Jan"
    var wiek: Int = 25
    wiek = 20
    println("Imię: $imie")
    println("Wiek: $wiek")
}

// ===================== ZADANIE 2 =====================
fun zadanie2() {
    println("\n--- Zadanie 2: Funkcja i operatory arytmetyczne ---")

    fun suma(a: Int, b: Int): Int {
        return a + b
    }

    val liczba1 = 15
    val liczba2 = 25

    val sumaWynik = suma(liczba1, liczba2)
    val iloczyn = liczba1 * liczba2

    println("Suma $liczba1 + $liczba2 = $sumaWynik")
    println("Iloczyn $liczba1 * $liczba2 = $iloczyn")
}

// ===================== ZADANIE 3 =====================
fun zadanie3() {
    println("\n--- Zadanie 3: Instrukcja warunkowa – Ocena z egzaminu ---")
    val wynikProcentowy: Int = 70
    val minimalnyWymaganyProcent: Int = 75

    if (wynikProcentowy >= minimalnyWymaganyProcent) {
        println("Gratulacje! Zdajesz część praktyczną egzaminu zawodowego.")
    } else {
        println("Nie uzyskujesz zaliczenia części praktycznej (wymagane 75%).")
    }
}

// ===================== ZADANIE 4 =====================
class Prostokat(val szerokosc: Double, val wysokosc: Double) {
    fun obliczPole(): Double {
        return szerokosc * wysokosc
    }
}

fun zadanie4() {
    println("\n--- Zadanie 4: Klasa Prostokąt i metoda obliczPole() ---")
    val prostokat = Prostokat(5.5, 10.0)
    val pole = prostokat.obliczPole()
    println("Pole prostokąta o szerokości ${prostokat.szerokosc} i wysokości ${prostokat.wysokosc} = $pole")
}

// ===================== ZADANIE 5 =====================
class Student(val imie: String, val oceny: List<Int>) {
    fun obliczSredniaOcen(): Double {
        return oceny.average()
    }
}

fun zadanie5() {
    println("\n--- Zadanie 5: Klasa Student i obliczanie średniej ocen ---")
    val student = Student("Anna", listOf(5, 4, 3, 5, 4))
    val srednia = student.obliczSredniaOcen()
    println("Student: ${student.imie}")
    println("Oceny: ${student.oceny}")
    println("Średnia ocen: ${"%.2f".format(srednia)}")
}