package org.example.klasaabstractiiter;

public class Kolo  extends  Ksztalt {

    private final double promien ;



    public Kolo(String kolor, double promien) {
        super(kolor);
        this.promien = promien;
    }

    @Override
    public double obliczPolePowierzchni() {
      //  return 3.14 * promien * promien;
        return Math.PI * promien * promien;
    }

//    @Override
//    public double obliczObwod() {
//        return 0;
//    }


}
