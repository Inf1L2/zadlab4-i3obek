package pl.edu.ur.polab4.obiekty;

public class Prostopadloscian {
    private String nazwa;
    private String kolor;
    private double bok1;
    private double bok2;
    private double bok3;

    public Prostopadloscian(String nazwa, String kolor, double bok1, double bok2, double bok3) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
    }

    private double pole(double bok1, double bok2, double bok3) {
        return (2.0D * bok1 * bok2) + (2.0D * bok2 * bok3) + (2.0D * bok1 * bok3);
    }

    private double objetosc(double bok1, double bok2, double bok3) {
        return bok1 * bok2 * bok3;
    }

    public String wyswietl(String nazwa, String kolor, double bok1, double bok2, double bok3) {
        System.out.println("Prostopadłościan: " + nazwa + "\tKolor: " + kolor + "\tBok1= " + bok1 + "\tBok2= " + bok2 + "\tWysokość= " + bok3 + "\tObjętość= " + this.objetosc(bok1, bok2, bok3) + "\tPole= " + this.pole(bok1, bok2, bok3));
        return "";
    }
}