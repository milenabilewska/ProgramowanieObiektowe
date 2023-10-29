package org.example.interfejs;

public class Kwadrat implements Ksztalt {

    private  double a;
    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double obliczPolePowierzchni() {
        return a * a;
    }

    @Override
    public double obliczObwod() {
        return 4*a;
    }


}
