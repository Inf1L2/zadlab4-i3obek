package pl.edu.ur.polab4.obiekty;

public class Kolo {
    protected String nazwa;
    protected String kolor;
    protected double promien;

    public Kolo(String nazwa, String kolor, double promien) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.promien = promien;
    }

    private double obwod(double promien) {
        return 2 * Math.PI * promien;
    }

    private double pole(double promien) {
        return Math.PI * promien * promien;
    }

    public String wyswietl(String nazwa, String kolor, double promien) {
        System.out.println("Kolo: " + nazwa + "\tKolor: " + kolor + "\tPromień= " + promien + "\tObwód= " + this.obwod(promien) + "\tPole= " + this.pole(promien));
        return "";
    }
}