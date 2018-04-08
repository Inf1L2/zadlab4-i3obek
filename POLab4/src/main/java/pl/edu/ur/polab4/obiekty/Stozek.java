package pl.edu.ur.polab4.obiekty;

public class Stozek {
    private String nazwa;
    private String kolor;
    private double r;
    private double h;
    private double l;

    public Stozek(String nazwa, String kolor, double r, double h, double l) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.r = r;
        this.h = h;
        this.l = l;
    }

    private double pole(double r, double h, double l) {
        return Math.PI * r * (r + l);
    }

    private double objetosc(double r, double h, double l) {
        return Math.PI * r * r * h;
    }

    public String wyswietl(String nazwa, String kolor, double r, double h, double l) {
        System.out.println("Stożek: " + nazwa + "\tKolor: " + kolor + "\tPromień= " + r + "\tWysokość= " + h + "\tTworząca= " + l + "\tPole= " + this.pole(r, h, l) + "\tObjętość= " + this.objetosc(r, h, l));
        return "";
    }
}