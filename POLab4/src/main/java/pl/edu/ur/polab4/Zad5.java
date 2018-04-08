package pl.edu.ur.polab4;

import pl.edu.ur.polab4.dane.Student;
import java.util.Scanner;

public class Zad5 {
    Scanner scan;
    Student[] tab;

    public Zad5() {
        this.scan = new Scanner(System.in);
        this.tab = new Student[100];
    }

    protected void full() {
        for(int i = 0; i < 100; ++i) {
            this.tab[i] = new Student("", "", "", 0, 0);
        }

    }

    private String wyswietl(int i) {
        System.out.println("\nNr. " + i + "\nImie: " + this.tab[i].getImie() + "\tNazwisko: " + this.tab[i].getNazwisko() + "\tNazwa specjalnosci: " + this.tab[i].getSpecjalnosc() + "\tNr indeksu: " + this.tab[i].getIndeks() + "\tRok studiow: " + this.tab[i].getRok() + "\n");
        return "";
    }

    protected void wprowadz() {
        System.out.println("Podaj indeks tablicy");
        int i = this.scan.nextInt();
        System.out.println("Imie");
        this.tab[i].setImie(this.scan.next());
        System.out.println("Nazwisko");
        this.tab[i].setNazwisko(this.scan.next());
        System.out.println("Nazwa specjalnosci");
        this.tab[i].setSpecjalnosc(this.scan.next());
        System.out.println("Nr indeksu");
        this.tab[i].setIndeks(this.scan.nextInt());
        System.out.println("Rok studiow");
        this.tab[i].setRok(this.scan.nextInt());
    }

    protected void edycja() {
        System.out.println("Podaj indeks tablicy");
        int i = this.scan.nextInt();
        System.out.println("Aktualne imie: " + this.tab[i].getImie() + "\nWprowadź zmainę");
        this.tab[i].setImie(this.scan.next());
        System.out.println("Aktualne nazwisko: " + this.tab[i].getNazwisko() + "\nWprowadź zmainę");
        this.tab[i].setNazwisko(this.scan.next());
        System.out.println("Aktualna nazwa specjalnosci: " + this.tab[i].getSpecjalnosc() + "\nWprowadź zmainę");
        this.tab[i].setSpecjalnosc(this.scan.next());
        System.out.println("Aktualny nr indeksu: " + this.tab[i].getIndeks() + "\nWprowadź zmainę");
        this.tab[i].setIndeks(this.scan.nextInt());
        System.out.println("Aktualny rok studiow: " + this.tab[i].getRok() + "\nWprowadź zmainę");
        this.tab[i].setRok(this.scan.nextInt());
    }

    protected void usun() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj numer obiektu");
        int i = scan.nextInt();
        this.tab[i].setImie("");
        this.tab[i].setNazwisko("");
        this.tab[i].setSpecjalnosc("");
        this.tab[i].setIndeks(0);
        this.tab[i].setRok(0);
    }

    protected void wyswietlStudenta() {
        System.out.println("Podaj numer obiektu");
        int i = this.scan.nextInt();
        this.wyswietl(i);
    }

    protected void pokazDane() {
        for(int i = 0; i < 100; ++i) {
            this.wyswietl(i);
        }

    }

    protected void wyswietlZakres() {
        System.out.println("Podaj poczatkowy numer obiektu");
        int iStart = this.scan.nextInt();
        System.out.println("Podaj koncowy numer obiektu");
        int iStop = this.scan.nextInt();

        for(int i = iStart; i <= iStop; ++i) {
            this.wyswietl(i);
        }

    }
}