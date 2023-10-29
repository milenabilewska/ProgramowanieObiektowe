package org.example.interfejs;

public class Kolo implements Ksztalt{
    double a;
    double h;

    public Kolo(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double obliczPolePowierzchni() {
        return 0.5 * a * h ;
        //return (1/2) * a * h ;
    }

    @Override
    public double obliczObwod() {
        return 0;
    }


}
