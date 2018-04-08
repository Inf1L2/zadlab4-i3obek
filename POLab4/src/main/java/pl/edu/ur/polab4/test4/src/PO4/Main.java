package PO4;

import PO4.obiekty.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Wybor wybierz = new Wybor();
        int menu;

        do{
            System.out.println("[4] - Zad 4\t[5] - Zad 5\n[0] - Zakończ program");
            menu = scan.nextInt();
            switch (menu){
                case 0:
                    System.out.println("Zamykanie programu");
                    break;
                case 4:
                    wybierz.zad4();
                    break;
                case 5:
                    //zadanie5();
                    break;
                default:
                    System.out.println("Błędny wybór");
                    break;
            }
        }while(menu!=0);
    }

    /*private static void zadanie5(){
        Studenci studenci1 = new Studenci();
        studenci1.wypelnijTablice();
        studenci1.menu();
    }*/
}