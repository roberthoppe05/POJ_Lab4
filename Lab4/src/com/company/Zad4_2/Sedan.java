package com.company.Zad4_2;

import javax.xml.namespace.QName;

public class Sedan extends Car implements Purchase {
    private int lenght;

    public Sedan(int speed, double regularPrice, String color, int lenght) {
        super(speed, regularPrice, color);
        this.lenght = lenght;
    }
    @Override
    public double getSalePrice() {
        double v;
        if (lenght > 20) {
            v = (super.getSalePrice() * 5) / 100;
            return getSalePrice() - v;
        } else {
            v = (super.getSalePrice() * 10) / 100;
            return super.getSalePrice() - v;
        }

    }

    @Override
    public String getPurchaseInfo() {
        return "SEDAN:";
    }
}
