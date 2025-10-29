import kotlin.system.exitProcess

// ------------------ Zadanie 1 ------------------
fun zad1() {
    fun suma(a: Int, b: Int): Int {
        return a + b
    }

    println("Zadanie 1: Podstawowa funkcja matematyczna")
    println("3 + 5 = ${suma(3, 5)}")
    println("10 + (-4) = ${suma(10, -4)}")
    println("0 + 12 = ${suma(0, 12)}")
}

// ------------------ Zadanie 2 ------------------
fun zad2() {
    fun czyParzysta(liczba: Int): Boolean {
        return liczba % 2 == 0
    }

    println("Zadanie 2: Funkcja warunkowa")
    print("Podaj liczbę całkowitą: ")
    val liczba = readLine()?.toIntOrNull() ?: 0
    println("Czy liczba jest parzysta? ${czyParzysta(liczba)}")
}

// ------------------ Zadanie 3 ------------------
class Osoba(val imie: String, val nazwisko: String, val wiek: Int) {
    fun pelneImie(): String = "$imie $nazwisko"
    fun wizytowka() {
        println("Imię i nazwisko: ${pelneImie()}, Wiek: $wiek")
    }
}

fun zad3() {
    println("Zadanie 3: Klasa Osoba")
    val osoby = listOf(
        Osoba("Anna", "Kowalska", 25),
        Osoba("Jan", "Nowak", 30),
        Osoba("Piotr", "Wiśniewski", 22)
    )
    osoby.forEach { it.wizytowka() }
}

// ------------------ Zadanie 4 ------------------
class Prostokat(val szerokosc: Double, val wysokosc: Double) {
    fun pole(): Double = szerokosc * wysokosc
}

fun zad4() {
    println("Zadanie 4: Klasa Prostokat")
    print("Podaj szerokość: ")
    val s = readLine()?.toDoubleOrNull() ?: 1.0
    print("Podaj wysokość: ")
    val w = readLine()?.toDoubleOrNull() ?: 1.0
    val p = Prostokat(s, w)
    println("Pole prostokąta: ${p.pole()}")
}

// ------------------ Zadanie 5 ------------------
open class Zwierze(val nazwa: String) {
    open fun dajGlos() {
        println("$nazwa wydaje dźwięk.")
    }
}

class Pies(nazwa: String) : Zwierze(nazwa) {
    override fun dajGlos() {
        println("$nazwa: Hau hau!")
    }
}

class Kot(nazwa: String) : Zwierze(nazwa) {
    override fun dajGlos() {
        println("$nazwa: Miau!")
    }
}

fun zad5() {
    println("Zadanie 5: Dziedziczenie")
    val zwierzeta = listOf(Zwierze("Zwierzątko"), Pies("Burek"), Kot("Mruczek"))
    zwierzeta.forEach { it.dajGlos() }
}

// ------------------ Zadanie 6 ------------------
class Student(val oceny: List<Double>) {
    fun srednia(): Double = if (oceny.isNotEmpty()) oceny.average() else 0.0
}

fun zad6() {
    println("Zadanie 6: Klasa Student")
    val student = Student(listOf(4.0, 3.5, 5.0, 4.5))
    println("Średnia ocen: ${student.srednia()}")
}

// ------------------ Zadanie 7 ------------------
class Auto(val marka: String, var predkosc: Int) {
    fun przyspiesz(oIle: Int) {
        predkosc += oIle
        println("$marka przyspiesza do $predkosc km/h")
    }

    fun zwolnij(oIle: Int) {
        predkosc = (predkosc - oIle).coerceAtLeast(0)
        println("$marka zwalnia do $predkosc km/h")
    }
}

fun zad7() {
    println("Zadanie 7: Własna klasa (Auto)")
    val auto = Auto("Toyota", 50)
    auto.przyspiesz(30)
    auto.zwolnij(60)
}

// ------------------ MENU ------------------
fun main() {
    while (true) {
        println("\n=== MENU ZADAŃ KOTLIN ===")
        println("1. Podstawowa funkcja matematyczna")
        println("2. Funkcja warunkowa")
        println("3. Klasa Osoba")
        println("4. Klasa Prostokat")
        println("5. Dziedziczenie (Zwierze, Pies, Kot)")
        println("6. Klasa Student")
        println("7. Własna klasa (Auto)")
        println("0. Wyjście")
        print("Wybierz numer zadania: ")

        when (readLine()) {
            "1" -> zad1()
            "2" -> zad2()
            "3" -> zad3()
            "4" -> zad4()
            "5" -> zad5()
            "6" -> zad6()
            "7" -> zad7()
            "0" -> {
                println("Koniec programu. Do widzenia!")
                exitProcess(0)
            }
            else -> println("Nieprawidłowy wybór, spróbuj ponownie.")
        }
    }
}