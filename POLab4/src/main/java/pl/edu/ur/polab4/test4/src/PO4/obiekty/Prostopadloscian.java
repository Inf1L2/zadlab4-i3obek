package PO4.obiekty;

public class Prostopadloscian {
    private String nazwa,kolor;
    private double bok1,bok2,bok3;

    public Prostopadloscian(String nazwa, String kolor, double bok1, double bok2, double bok3) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
    }

    private double pole(){
        return (2*bok1*bok2)+(2*bok2*bok3)+(2*bok1*bok3);
    }

    private double objetosc(){
        return bok1*bok2*bok3;
    }

    public String wyswietl(){
        return "Prostopadłościan "+nazwa+" kolor "+kolor+" bok1 "+bok1+" bok2 "+bok2+" wysokość "+bok3+" objętość "+objetosc()+" pole "+pole();
    }
}
