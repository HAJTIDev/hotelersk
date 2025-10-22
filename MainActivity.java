fun main() {
    zadanie1()
    zadanie2()
    zadanie3()
    zadanie5()
    zadanie6()
}

fun zadanie1() {
    var wynik: Int = 50
    println("Początkowa wartość wynik: $wynik")
    val stalaPodstawa: Int = 10
    println("Wartość stałej stalaPodstawa: $stalaPodstawa")
    wynik = 75
    println("Nowa wartość wynik: $wynik")
    var zmiennaString: String = "Witaj"
    val stalaString: String = "Kotlin"
    println("$zmiennaString, $stalaString!")
}

fun zadanie2() {
    val liczba1: Int = 20
    val liczba2: Int = 3
    val wynikDzielInt: Int = liczba1 / liczba2
    println("Wynik dzielenia całkowitego: $wynikDzielInt")
    val wynikDzielDouble: Double = liczba1.toDouble() / liczba2
    println("Wynik dzielenia zmiennoprzecinkowego: $wynikDzielDouble")
}

fun zadanie3() {
    val imie1: String = "Anna"
    val imie2: String = "anna"
    val czyRowne: Boolean = imie1 == imie2
    println("Czy imiona są równe? $czyRowne")
    val tempPokojowa: Int = 20
    val tempZewnetrzna: Int = 15
    val czyWieksza: Boolean = tempPokojowa > tempZewnetrzna
    println("Czy temperatura pokojowa jest wyższa niż zewnętrzna? $czyWieksza")
}

fun zadanie5() {
    val wiekUzytkownika: Int = 17
    val minimalnyWiek: Int = 18
    if (wiekUzytkownika >= minimalnyWiek) {
        println("Jesteś pełnoletni/a i możesz głosować.")
    } else {
        println("Nie masz jeszcze prawa głosu.")
    }
}

fun zadanie6() {
    val liczby: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for (i in liczby.indices) {
        println("Element $i: ${liczby[i]}")
    }
    for (liczba in liczby) {
        println(liczba)
    }
}