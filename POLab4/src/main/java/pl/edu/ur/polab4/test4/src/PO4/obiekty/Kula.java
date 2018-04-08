package PO4.obiekty;

public class Kula {
    private String nazwa,kolor;
    private double promien;

    public Kula(String nazwa, String kolor, double promien) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.promien = promien;
    }

    private double pole(){
        return 4*Math.PI*promien*promien;
    }

    private double objetosc(){
        return (4/3)*Math.PI*promien*promien*promien;
    }

    public String wyswietl(){
        return "Kula "+nazwa+" kolor "+kolor+" promień "+promien+" pole "+pole()+" objętość "+objetosc();
    }

}
