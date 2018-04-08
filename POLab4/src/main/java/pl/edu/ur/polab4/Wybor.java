package pl.edu.ur.polab4;

import java.util.Scanner;

public class Wybor {
    Scanner scan;
    String nazwa;
    String kolor;
    double a;
    double b;
    double c;

    public Wybor() {
        this.scan = new Scanner(System.in);
    }

    public Wybor(String nazwa, String kolor, double a) {
        this.scan = new Scanner(System.in);
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.a = a;
    }

    public Wybor(String nazwa, String kolor, double a, double b) {
        this.scan = new Scanner(System.in);
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.a = a;
        this.b = b;
    }

    public Wybor(String nazwa, String kolor, double a, double b, double c) {
        this.scan = new Scanner(System.in);
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected void menu() {
        int i;
        do {
            System.out.println("[4] - Zad 4\t[5] - Zad 5\n[0] - Zakończ program");
            i = this.scan.nextInt();
            switch(i) {
            case 0:
                System.out.println("Zamykanie programu");
                break;
            case 4:
                this.zad4();
                break;
            case 5:
                this.zad5();
                break;
            default:
                System.out.println("Błędny wybór");
            }
        } while(i != 0);

    }

    private void zad4() {
        Zad4 zad4 = new Zad4();

        int i;
        do {
            System.out.println("[1] - Kolo\t[2] - Kula\t[3] - Kwadrat\n[4] - Prostokąt\t[5] - Prostopadłościan\t[6] - Stożek\n[7] - Sześcian\n[0] - Powrót do menu głównego");
            i = this.scan.nextInt();
            switch(i) {
            case 0:
                break;
            case 1:
                zad4.kolo();
                break;
            case 2:
                zad4.kula();
                break;
            case 3:
                zad4.kwadrat();
                break;
            case 4:
                zad4.prostokat();
                break;
            case 5:
                zad4.prostopadloscian();
                break;
            case 6:
                zad4.stozek();
                break;
            case 7:
                zad4.szescian();
                break;
            default:
                System.out.println("Błędny wybór");
            }
        } while(i != 0);

    }

    private void zad5() {
        Zad5 zad5 = new Zad5();
        zad5.full();

        int i;
        do {
            System.out.println("[1] - Wprowadź dane\t[2] - Edytuj obiekt\t[3] - Usuń obiekt\n[4] - Wyświetlenie wybranego obiektu\t[5] - Wyświetlenie wszystkich obiektów\t[6] - Wyświetlenie podanego zakresu\n[0] - Powrót do menu głównego");
            i = this.scan.nextInt();
            switch(i) {
            case 0:
                break;
            case 1:
                zad5.wprowadz();
                break;
            case 2:
                zad5.edycja();
                break;
            case 3:
                zad5.usun();
                break;
            case 4:
                zad5.wyswietlStudenta();
                break;
            case 5:
                zad5.pokazDane();
                break;
            case 6:
                zad5.wyswietlZakres();
                break;
            default:
                System.out.println("Błędny wybór");
            }
        } while(i != 0);

    }
}