package org.example.dziedziczenie;

public class Motocykl extends Pojazd {
    public Motocykl() {
    }

    public Motocykl(String nazwa, String model, int rokProdukcji) {
        super(nazwa, model, rokProdukcji);
    }

    void wyswietlInformacjeMotocykl() {
        wyswietlIformacje();
    }

    @Override
    void wyswietlIformacje() {
        super.wyswietlIformacje();
    }




}
