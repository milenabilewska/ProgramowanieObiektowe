package org.example.klasaabstractiiter;

public class Kwadrat  extends  Ksztalt{

    private  final double a;


    public Kwadrat(String kolor, double a) {
        super(kolor);
        this.a = a;
    }

    @Override
    public double obliczPolePowierzchni() {
        return a * a;
    }

//    @Override
//    public double obliczObwod() {
//        return 0;
//    }



}
