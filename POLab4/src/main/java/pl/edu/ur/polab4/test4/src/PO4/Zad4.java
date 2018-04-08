package PO4;

import PO4.obiekty.*;

import java.util.Scanner;

public class Zad4 {
    Scanner scan = new Scanner(System.in);
    String nazwa,kolor;
    double a,b,c;
    private void kolo(){
        System.out.println("Podaj parametry koła takie jak jego\nNazwa");
        nazwa = scan.nextLine();

        System.out.println("Kolor");
        String kolor = scan.nextLine();

        System.out.println("Promien");
        a = scan.nextDouble();

        Kolo kolo1 = new Kolo(nazwa,kolor,a);
        kolo1.wyswietl();
    }

    private void kula(){
        System.out.println("Podaj parametry kuli takie jak jej\nNazwa");
        nazwa = scan.nextLine();

        System.out.println("Kolor");
        kolor = scan.nextLine();

        System.out.println("Promien");
        a = scan.nextDouble();

        Kula kula1 = new Kula(nazwa,kolor,a);
        kula1.wyswietl();
    }

    private void kwadrat(){
        System.out.println("Podaj parametry kwadratu takie jak jego\nNazwa");
        nazwa = scan.nextLine();

        System.out.println("Kolor");
        kolor = scan.nextLine();

        System.out.println(" Dlugosc boku: ");
        a = scan.nextDouble();

        Kwadrat kwadrat1 = new Kwadrat(nazwa,kolor,a);
        kwadrat1.wyswietl();
    }

    private void prostokat(){
        System.out.println("Podaj parametry prostokątu takie jak jego\nNazwa");
        nazwa = scan.nextLine();

        System.out.println("Kolor");
        kolor = scan.nextLine();

        System.out.println("Długość boku a");
        a = scan.nextDouble();

        System.out.println("Długość boku b");
        b = scan.nextDouble();

        Prostokat prostokat1 = new Prostokat(nazwa,kolor,a,b);
        prostokat1.wyswietl();
    }

    private void prostopadloscian(){
        System.out.println("Podaj parametry prostopadłościanu takie jak jego\nNazwa");
        String nazwa = scan.nextLine();

        System.out.println("Kolor");
        String kolor = scan.nextLine();

        System.out.println("Dlugosc boku a");
        a = scan.nextDouble();

        System.out.println("Dlugosc boku b");
        b = scan.nextDouble();

        System.out.println("Wysokość");
        c = scan.nextDouble();

        Prostopadloscian prostopadloscian1 = new Prostopadloscian(nazwa,kolor,a,b,c);
        prostopadloscian1.wyswietl();
    }

    private void stozek(){
        System.out.println("Podaj parametry stożka takie jak jego\nNazwa");
        nazwa = scan.nextLine();

        System.out.println("Kolor");
        kolor = scan.nextLine();

        System.out.println("Dlugosc promienia podstawy");
        a = scan.nextDouble();

        System.out.println("Wysokosc stozka");
        b = scan.nextDouble();

        System.out.println("Dlugosc tworzacej stozka");
        c = scan.nextDouble();

        Stozek stozek1 = new Stozek(nazwa,kolor,a,b,c);
        stozek1.wyswietl();
    }

    private void szescian(){
        System.out.println("Podaj parametry sześcianu takie jak jego\nNazwa");
        nazwa = scan.nextLine();

        System.out.print("Kolor");
        kolor = scan.nextLine();

        System.out.print("Dlugosc boku");
        a = scan.nextDouble();

        Szescian szescian1 = new Szescian(nazwa,kolor,a);
        szescian1.wyswietl();
    }
}
