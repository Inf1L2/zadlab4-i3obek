package pl.edu.ur.polab4.obiekty;

public class Kula {
    private String nazwa;
    private String kolor;
    private double promien;

    public Kula(String nazwa, String kolor, double promien) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.promien = promien;
    }

    private double pole(double promien) {
        return 4 * Math.PI * promien * promien;
    }

    private double objetosc(double promien) {
        return (4/3) * Math.PI * promien * promien * promien;
    }

    public String wyswietl(String nazwa, String kolor, double promien) {
        System.out.println("Kula: " + nazwa + "\tKolor: " + kolor + "\tPromień= " + promien + "\tPole= " + this.pole(promien) + "\tObjętość= " + this.objetosc(promien));
        return "";
    }
}