package org.example.klasaabstractiiter;

public class Kwadrat  extends  Ksztalt{

    private  double a;


    public Kwadrat(String kolor, double a) {
        super(kolor);
        this.a = a;
    }

    @Override
    public double obliczPolePowierzchni() {
        return a * a;
    }


}
