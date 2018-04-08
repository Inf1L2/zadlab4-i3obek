package PO4.obiekty;

public class Kwadrat {
    private String nazwa,kolor;
    private double bok;

    public Kwadrat(String nazwa, String kolor, double bok) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.bok = bok;
    }

    private double obwod(){
        return bok*bok;
    }

    private double pole(){
        return 4*bok;
    }

    public String wyswietl(){
        return "Kwadrat "+nazwa+" kolor "+kolor+" bok "+bok+" obwód "+obwod()+" pole "+pole();
    }
}
