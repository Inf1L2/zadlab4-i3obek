package PO4.obiekty;

public class Szescian {
    private String nazwa,kolor;
    private double bok;

    public Szescian(String nazwa, String kolor, double bok) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.bok = bok;
    }

    private double pole(){
        return 6*(bok*bok);
    }

    private double objetosc(){
        return bok*bok*bok;
    }

    public String wyswietl(){
        return "Sześcian "+nazwa+" kolor "+kolor+" długość krawędzi "+bok+" pole "+pole()+" objętość "+objetosc();
    }
}
