package org.example.klasaiobiekt;

public class Main {

    public static void main(String[] args) {

        //obiekt
        Samochod samochod = new Samochod( "Marka samochodu ", "Model samochodu\n" );
        //wywolanie metody
        samochod.uruchomSilnik();
        samochod.uruchomSilnik();
        samochod.zatrzymajSilnik();
        samochod.zatrzymajSilnik();


        System.out.println("  ");
        System.out.println("  ");
        Samochod samochod1 = new Samochod( "Marka samochodu ", "Model samochodu\n" );
        samochod.uruchomSilnik();
        samochod.uruchomSilnik();
        samochod.zatrzymajSilnik();
        samochod.zatrzymajSilnik();


        Samochod samochod2 = new Samochod( "Marka samochodu ", "Model samochodu\n" );
        samochod.uruchomSilnik();
        samochod.uruchomSilnik();
        samochod.zatrzymajSilnik();
        samochod.zatrzymajSilnik();





    }

}