package PO4.obiekty;

public class Kolo {
    private String nazwa,kolor;
    private double promien;

    public Kolo() {
    }

    public Kolo(String nazwa, String kolor, double promien) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.promien = promien;
    }

    /*public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }*/

    private double obwod(){
        return 2*Math.PI*promien;
    }

    private double pole(){
        return Math.PI*promien*promien;
    }

    public void wyswietl() {
        System.out.println("Kolo " + nazwa + " kolor "+kolor+" promień "+promien+" obwód "+obwod()+" pole "+pole());
    }
}
