package org.example.klasaabstractiiter;

abstract class Ksztalt {
    protected String kolor;

    public Ksztalt(String kolor) {
        this.kolor = kolor;
    }

    //deklaracja metody abstrakcyjnej(brak implementacji)
    public abstract double obliczPolePowierzchni();


    //metoda zwykla (zawierajaca implementacje)

    public void wyswietlInformacje(){

        System.out.println("Ksztalt ");

    }





}
