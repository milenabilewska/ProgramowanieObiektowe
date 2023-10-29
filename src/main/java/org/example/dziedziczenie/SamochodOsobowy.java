package org.example.dziedziczenie;

public class SamochodOsobowy extends Pojazd{

    int liczbaDrzwi;

    public SamochodOsobowy() {
    }

    public SamochodOsobowy(String nazwa, String model, int rokProdukcji, int liczbaDrzwi) {
        super(nazwa, model, rokProdukcji); //wywolywanie klasy bazowwej
        this.liczbaDrzwi = liczbaDrzwi;
    }

    void wyswietlInformacjeSamochoduOsobowego() {
        wyswietlIformacje(); // Wywołanie metody z klasy bazowej
        System.out.println("Liczba drzwi: " + liczbaDrzwi);
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }



}
