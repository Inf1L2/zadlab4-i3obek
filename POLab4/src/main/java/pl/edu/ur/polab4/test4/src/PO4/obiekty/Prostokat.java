package PO4.obiekty;

public class Prostokat {
    private String nazwa,kolor;
    private double bok1,bok2;

    public Prostokat(String nazwa, String kolor, double bok1, double bok2) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    private double obwod(){
        return (2*bok1)+(2*bok2);
    }

    private double pole(){
        return bok2*bok1;
    }

    public String wyswietl(){
        return "Prostokąt "+nazwa+" kolor "+kolor+" bok1 "+bok1+" bok2 "+bok2+" obwód "+obwod()+" pole "+pole();
    }
}
