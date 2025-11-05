// 4TP Kotlin2
// Wszystkie zadania w jednym pliku

fun main() {
    println("=== Zad. 1 ===")
    // Zad. 1 – Podstawowa funkcja matematyczna
    fun suma(a: Int, b: Int): Int = a + b
    println("Suma 2 + 3 = ${suma(2, 3)}")
    println("Suma 10 + 25 = ${suma(10, 25)}")

    println("\n=== Zad. 2 ===")
    // Zad. 2 – Funkcja warunkowa
    fun czyParzysta(liczba: Int): Boolean = liczba % 2 == 0
    println("4 jest parzysta? ${czyParzysta(4)}")
    println("7 jest parzysta? ${czyParzysta(7)}")

    println("\n=== Zad. 3 ===")
    // Zad. 3 – Klasa "Osoba"
    class Osoba(val imie: String, val nazwisko: String, val wiek: Int) {
        fun wizytowka(): String = "$imie $nazwisko"
    }

    val osoba1 = Osoba("Anna", "Kowalska", 25)
    val osoba2 = Osoba("Jan", "Nowak", 30)
    println(osoba1.wizytowka())
    println(osoba2.wizytowka())

    println("\n=== Zad. 4 ===")
    // Zad. 4 – Klasa Prostokąt
    class Prostokat(val szerokosc: Double, val wysokosc: Double) {
        fun pole(): Double = szerokosc * wysokosc
    }

    val p1 = Prostokat(4.0, 5.0)
    val p2 = Prostokat(3.5, 2.2)
    println("Pole prostokąta p1 = ${p1.pole()}")
    println("Pole prostokąta p2 = ${p2.pole()}")

    println("\n=== Zad. 5 ===")
    // Zad. 5 – Dziedziczenie
    open class Zwierze(val nazwa: String) {
        open fun dajGlos() {
            println("$nazwa wydaje jakiś dźwięk")
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

    val pies = Pies("Burek")
    val kot = Kot("Mruczek")
    pies.dajGlos()
    kot.dajGlos()

    println("\n=== Zad. 6 ===")
    // Zad. 6 – Konstruktor i inicjalizacja
    class Student(val oceny: List<Double>) {
        fun srednia(): Double {
            return if (oceny.isNotEmpty()) oceny.average() else 0.0
        }
    }

    val student = Student(listOf(4.0, 5.0, 3.5, 4.5))
    println("Średnia studenta: ${student.srednia()}")

    println("\n=== Zad. 7 ===")
    // Zad. 7 – Własna klasa
    class BankAccount(val owner: String, var balance: Double) {
        fun deposit(amount: Double) {
            balance += amount
            println("Wpłacono $amount PLN. Nowe saldo: $balance PLN")
        }

        fun withdraw(amount: Double) {
            if (amount <= balance) {
                balance -= amount
                println("Wypłacono $amount PLN. Pozostało: $balance PLN")
            } else {
                println("Brak środków na koncie.")
            }
        }
    }

    val konto = BankAccount("Adam Kowal", 1000.0)
    konto.deposit(250.0)
    konto.withdraw(400.0)
    konto.withdraw(1000.0)
}