package org.example.dziedziczenie;

public class SamochodCiezarowy  extends  Pojazd{

    String  pojemnoscSilnika;

    public SamochodCiezarowy() {
    }

    public SamochodCiezarowy(String nazwa, String model, int rokProdukcji, String pojemnoscSilnika) {
        super(nazwa, model, rokProdukcji);
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    void wyswietlInformacjeSamochoduCiezarowego() {
        wyswietlIformacje(); // Wywołanie metody z klasy bazowej
        System.out.println("Pojemnosc silnika:  " + pojemnoscSilnika);
    }

    public String getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(String pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }
}
