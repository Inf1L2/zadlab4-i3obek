package PO4.obiekty;

public class Stozek {
    private String nazwa,kolor;
    private double r,h,l;

    public Stozek(String nazwa, String kolor, double r, double h, double l) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.r = r;
        this.h = h;
        this.l = l;
    }

    private double pole(){
        return Math.PI*r*(r+l);
    }

    private double objetosc(){
        return (1/3)*(Math.PI*r*r*h);
    }

    public String wyswietl(){
        return "Stożek "+nazwa+" kolor "+kolor+" promień "+r+" wysokość "+h+" tworząca "+l;
    }
}
