package pl.edu.ur.polab4.obiekty;

public class Kwadrat {
    private String nazwa;
    private String kolor;
    private double bok;

    public Kwadrat(String nazwa, String kolor, double bok) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.bok = bok;
    }

    private double obwod(double bok) {
        return bok * bok;
    }

    private double pole(double bok) {
        return 4.0D * bok;
    }

    public String wyswietl(String nazwa, String kolor, double bok) {
        System.out.println("Kwadrat: " + nazwa + "\tKolor: " + kolor + "\tBok= " + bok + "\tObwód= " + this.obwod(bok) + "\tPole= " + this.pole(bok));
        return "";
    }
}