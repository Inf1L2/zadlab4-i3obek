package pl.edu.ur.polab4.obiekty;

public class Prostokat {
    private String nazwa;
    private String kolor;
    private double bok1;
    private double bok2;

    public Prostokat(String nazwa, String kolor, double bok1, double bok2) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    private double obwod(double bok1, double bok2) {
        return (2.0D * bok1) + (2.0D * bok2);
    }

    private double pole(double bok1, double bok2) {
        return bok2 * bok1;
    }

    public String wyswietl(String nazwa, String kolor, double bok1, double bok2) {
        System.out.println("Prostokąt: " + nazwa + "\tKolor: " + kolor + "\tBok1= " + bok1 + "\tBok2= " + bok2 + "\tObwód= " + this.obwod(bok1, bok2) + "\tPole= " + this.pole(bok1, bok2));
        return "";
    }
}