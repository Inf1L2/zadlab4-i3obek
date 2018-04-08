package pl.edu.ur.polab4;

import pl.edu.ur.polab4.obiekty.*;
import java.util.Scanner;

public class Zad4 extends Wybor {
    Scanner scan;
    String nazwa;
    String kolor;
    double a;
    double b;
    double c;
    Kolo kol;
    Kula kul;
    Kwadrat kw;
    Prostokat prokat;
    Prostopadloscian proscian;
    Stozek sto;
    Szescian szesc;

    public Zad4() {
        this.scan = new Scanner(System.in);
        this.kol = new Kolo(this.nazwa, this.kolor, this.a);
        this.kul = new Kula(this.nazwa, this.kolor, this.a);
        this.kw = new Kwadrat(this.nazwa, this.kolor, this.a);
        this.prokat = new Prostokat(this.nazwa, this.kolor, this.a, this.b);
        this.proscian = new Prostopadloscian(this.nazwa, this.kolor, this.a, this.b, this.c);
        this.sto = new Stozek(this.nazwa, this.kolor, this.a, this.b, this.c);
        this.szesc = new Szescian(this.nazwa, this.kolor, this.a);
    }

    protected void kolo() {
        System.out.println("Podaj parametry koła takie jak jego\nNazwa");
        this.nazwa = this.scan.next();
        System.out.println("Kolor");
        this.kolor = this.scan.next();
        System.out.println("Promien");
        this.a = this.scan.nextDouble();
        this.kol.wyswietl(this.nazwa, this.kolor, this.a);
    }

    protected void kula() {
        System.out.println("Podaj parametry kuli takie jak jej\nNazwa");
        this.nazwa = this.scan.next();
        System.out.println("Kolor");
        this.kolor = this.scan.next();
        System.out.println("Promien");
        this.a = this.scan.nextDouble();
        this.kul.wyswietl(this.nazwa, this.kolor, this.a);
    }

    protected void kwadrat() {
        System.out.println("Podaj parametry kwadratu takie jak jego\nNazwa");
        this.nazwa = this.scan.next();
        System.out.println("Kolor");
        this.kolor = this.scan.next();
        System.out.println("Dlugosc boku: ");
        this.a = this.scan.nextDouble();
        this.kw.wyswietl(this.nazwa, this.kolor, this.a);
    }

    protected void prostokat() {
        System.out.println("Podaj parametry prostokątu takie jak jego\nNazwa");
        this.nazwa = this.scan.next();
        System.out.println("Kolor");
        this.kolor = this.scan.next();
        System.out.println("Długość boku a");
        this.a = this.scan.nextDouble();
        System.out.println("Długość boku b");
        this.b = this.scan.nextDouble();
        this.prokat.wyswietl(this.nazwa, this.kolor, this.a, this.b);
    }

    protected void prostopadloscian() {
        System.out.println("Podaj parametry prostopadłościanu takie jak jego\nNazwa");
        this.nazwa = this.scan.next();
        System.out.println("Kolor");
        this.kolor = this.scan.next();
        System.out.println("Dlugosc boku a");
        this.a = this.scan.nextDouble();
        System.out.println("Dlugosc boku b");
        this.b = this.scan.nextDouble();
        System.out.println("Wysokość");
        this.c = this.scan.nextDouble();
        this.proscian.wyswietl(this.nazwa, this.kolor, this.a, this.b, this.c);
    }

    protected void stozek() {
        System.out.println("Podaj parametry stożka takie jak jego\nNazwa");
        this.nazwa = this.scan.next();
        System.out.println("Kolor");
        this.kolor = this.scan.next();
        System.out.println("Dlugosc promienia podstawy");
        this.a = this.scan.nextDouble();
        System.out.println("Wysokosc stozka");
        this.b = this.scan.nextDouble();
        System.out.println("Dlugosc tworzacej stozka");
        this.c = this.scan.nextDouble();
        this.sto.wyswietl(this.nazwa, this.kolor, this.a, this.b, this.c);
    }

    protected void szescian() {
        System.out.println("Podaj parametry sześcianu takie jak jego\nNazwa");
        this.nazwa = this.scan.next();
        System.out.println("Kolor");
        this.kolor = this.scan.next();
        System.out.println("Dlugosc boku");
        this.a = this.scan.nextDouble();
        this.szesc.wyswietl(this.nazwa, this.kolor, this.a);
    }
}