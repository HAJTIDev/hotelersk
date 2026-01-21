using System;

class Notatka
{
    // pola statyczne (niedostępne dla klas pochodnych)
    private static int licznikNotatek = 0;

    // pola instancji
    protected int id;
    protected string tytul;
    protected string tresc;

    // konstruktor
    public Notatka(string tytul, string tresc)
    {
        licznikNotatek++;
        this.id = licznikNotatek;
        this.tytul = tytul;
        this.tresc = tresc;
    }

    // metoda 1 – wyświetlanie notatki
    public void Wyswietl()
    {
        Console.WriteLine("----- NOTATKA -----");
        Console.WriteLine($"ID: {id}");
        Console.WriteLine($"Tytuł: {tytul}");
        Console.WriteLine($"Treść: {tresc}");
        Console.WriteLine("-------------------");
    }

    // metoda 2 – edycja treści
    public void Edytuj()
    {
        Console.Write("Podaj nowy tytuł: ");
        tytul = Console.ReadLine();

        Console.Write("Podaj nową treść: ");
        tresc = Console.ReadLine();
    }
}

class Program
{
    static void Main(string[] args)
    {
        // tworzenie notatek
        Notatka n1 = new Notatka("Zakupy", "Chleb, mleko, masło");
        Notatka n2 = new Notatka("Szkoła", "Sprawdzian z C#");

        // wyświetlanie
        n1.Wyswietl();
        n2.Wyswietl();

        // edycja pierwszej notatki
        n1.Edytuj();

        // ponowne wyświetlenie
        n1.Wyswietl();

        Console.WriteLine("Naciśnij dowolny klawisz...");
        Console.ReadKey();
    }
}