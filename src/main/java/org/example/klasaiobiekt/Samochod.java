package org.example.klasaiobiekt;

public class Samochod {


    private  String  marka;
    private  String model ;
    private boolean silnikUruchomiony;


    public Samochod() {
    }

    public Samochod(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isSilnikUruchomiony() {
        return silnikUruchomiony;
    }

    public void setSilnikUruchomiony(boolean silnikUruchomiony) {
        this.silnikUruchomiony = silnikUruchomiony;
    }

    void uruchomSilnik() {
        if(!silnikUruchomiony) {
            System.out.println("Uruchamiam silnik " + marka + " " + model );
            silnikUruchomiony = true;

        } else {

            System.out.println( "Silnik jest uruchomiony!");
        }

    }


    void zatrzymajSilnik() {
        if(silnikUruchomiony) {
            System.out.println("Zatrzymaj silnik samochodu " + marka + " " + model );
            silnikUruchomiony = false;

        } else {

            System.out.println( "Silnik jest zatrzymany!");
        }

    }



}
