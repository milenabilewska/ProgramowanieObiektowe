package org.example.klasaabstrakcyjna;

public class Main {

    public static void main(String[] args) {

        Ksztalt kolo = new Kolo("Czerwony" , 2.0);
        Ksztalt kwadrat = new Kwadrat("Czarny", 2.22);

        kolo.wyswietlInformacje();
        System.out.println("\n");
        System.out.println(" pole powierzchni kola: " + kolo.obliczPolePowierzchni());

        System.out.println("\n");
        System.out.println("\n");
        kwadrat.wyswietlInformacje();
        System.out.println("\n");
        System.out.println("pole powierzchni kwadrat:"  + kwadrat.obliczPolePowierzchni());


        System.out.println("\n");
        System.out.println("\n");


        Ksztalt kolo1 = new Kolo("Zelony" , 2.0);
        Ksztalt kwadrat1 = new Kwadrat("Niebieski", 2.22);

        kolo.wyswietlInformacje();
        System.out.println("\n");
        System.out.println(" pole powierzchni kola: " + kolo1.obliczPolePowierzchni());

        System.out.println("\n");
        System.out.println("\n");
        kwadrat.wyswietlInformacje();
        System.out.println("\n");
        System.out.println("pole powierzchni kwadrat:"  + kwadrat1.obliczPolePowierzchni());



        Ksztalt trojkat = new Trojkat("Zelony");
        trojkat.wyswietlInformacje();

        trojkat.obliczPolePowierzchni();



    }
}
