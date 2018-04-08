package PO4;

import java.util.*;

public class Wybor {

    private static void zad4(){
        Scanner scan = new Scanner(System.in);
        Zad4 zad4 new Zad4();
        int i;
        do{
            System.out.println("[1] - Kolo\t[2] - Kula\t[3] - Kwadrat\n[4] - Prostokąt\t[5] - Prostopadłościan\t[6] - Stożek\n[7] - Sześcian\n[0] - Powrót do menu głównego");
            i=scan.nextInt();

            switch(i){
                case 0:
                    break;
                case 1:
                    zadanie4kolo();
                    break;
                case 2:
                    zadanie4kula();
                    break;
                case 3:
                    zadanie4kwadrat();
                    break;
                case 4:
                    zadanie4prostokat();
                    break;
                case 5:
                    zadanie4prostopadloscian();
                    break;
                case 6:
                    zadanie4stozek();
                    break;
                case 7:
                    zadanie4szescian();
                    break;
                default:
                    System.out.println("Błędny wybór");
                    break;
            }
        }while(i!=0);
    }
}
