package org.example.dziedziczenie;

public class Pojazd {
    private String nazwa;
    private String model;
    private int rokProdukcji;

    public Pojazd() {
    }

    public Pojazd(String nazwa, String model, int rokProdukcji) {
        this.nazwa = nazwa;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    void wyswietlIformacje () {
        System.out.println("Marka "  + nazwa);
        System.out.println("Model " + model);
        System.out.println("Rok produkcji " + rokProdukcji);
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "nazwa='" + nazwa + '\'' +
                ", model='" + model + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }
}
