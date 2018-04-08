package pl.edu.ur.polab4.dane;

public class Student {
    private String imie;
    private String nazwisko;
    private String specjalnosc;
    private int indeks;
    private int rok;

    public Student() {
    }

    public Student(String imie, String nazwisko, String specjalnosc, int indeks, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.specjalnosc = specjalnosc;
        this.indeks = indeks;
        this.rok = rok;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String imie, String nazwisko, String specjalnosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.specjalnosc = specjalnosc;
    }

    public Student(String imie, String nazwisko, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rok = rok;
    }

    public Student(String imie, String nazwisko, String specjalnosc, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.specjalnosc = specjalnosc;
        this.indeks = indeks;
    }

    public String getImie() {
        return this.imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getSpecjalnosc() {
        return this.specjalnosc;
    }

    public void setSpecjalnosc(String specjalnosc) {
        this.specjalnosc = specjalnosc;
    }

    public int getIndeks() {
        return this.indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public int getRok() {
        return this.rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String wyswietl() {
        return "Imie='" + this.imie + "' Nazwisko='" + this.nazwisko + "' Specjalnosc='" + this.specjalnosc + "' Indeks= " + this.indeks + " Rok= " + this.rok;
    }
}