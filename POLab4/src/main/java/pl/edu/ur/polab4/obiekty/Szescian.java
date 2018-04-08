package pl.edu.ur.polab4.obiekty;

public class Szescian {
    private String nazwa;
    private String kolor;
    private double bok;

    public Szescian(String nazwa, String kolor, double bok) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.bok = bok;
    }

    private double pole(double bok) {
        return 6.0D * bok * bok;
    }

    private double objetosc(double bok) {
        return bok * bok * bok;
    }

    public String wyswietl(String nazwa, String kolor, double bok) {
        System.out.println("Sześcian: " + nazwa + "\tKolor: " + kolor + "\tKrawędź= " + bok + "\tPole= " + this.pole(bok) + "\tObjętość= " + this.objetosc(bok));
        return "";
    }
}