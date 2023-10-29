package org.example.interfejs;

public class Main {

    public static void main(String[] args) {

        Ksztalt kwadrat = new Kwadrat(10.22);
        System.out.println( "Pole kwadratu " + kwadrat.obliczPolePowierzchni());
        System.out.println ( "Obwod kwadratu " + kwadrat.obliczObwod());

        Ksztalt kwadrat1 = new Kwadrat(12.22);
        System.out.println( "Pole kwadratu " + kwadrat1.obliczPolePowierzchni());
        System.out.println ( "Obwod kwadratu " + kwadrat1.obliczObwod());

        Ksztalt kolo = new Kolo (12.0, 5.0);
        System.out.println( "Pole kola " + kolo.obliczPolePowierzchni());
        // System.out.println ( "Obwod " + kolo.obliczObwod());

        Ksztalt kolo1 = new Kolo (125.0, 55.0);
        System.out.println( "Pole kola " + kolo1.obliczPolePowierzchni());
     //   System.out.println ( "Obwod " + kolo1.obliczObwod());


    }
}
