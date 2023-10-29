package org.example.dziedziczenie;

public class Main {

    public static void main(String[] args) {

        SamochodOsobowy samochodOsobowy = new SamochodOsobowy("Nazwa Samochodu" , "Marka samochdu", 2023, 5);
        samochodOsobowy.wyswietlInformacjeSamochoduOsobowego();
        System.out.println("  ");
        samochodOsobowy.wyswietlIformacje();

        System.out.println("  ");
        System.out.println("  ");

        SamochodCiezarowy samochodCiezarowy = new SamochodCiezarowy("Nazwa Samochodu" , "Marka samochdu", 2023, "5000");
        samochodCiezarowy.wyswietlInformacjeSamochoduCiezarowego();
        System.out.println("  ");
        samochodCiezarowy.wyswietlIformacje();

        System.out.println("  ");
        System.out.println("  ");

        Motocykl motocykl= new Motocykl("Nazwa " , "Marka ", 2023);
        motocykl.wyswietlInformacjeMotocykl();
        System.out.println("  ");
        motocykl.wyswietlIformacje();
        System.out.println("  ");
        motocykl.wyswietlIformacje();


    }
}
