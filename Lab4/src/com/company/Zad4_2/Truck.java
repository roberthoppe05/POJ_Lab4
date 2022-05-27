package com.company.Zad4_2;

public class Truck extends Car implements Purchase {
    private int weight;

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            double v = super.getSalePrice() * 10 / 100;
            return super.getSalePrice() - v;
        } else
            return super.getSalePrice();
    }

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public String getPurchaseInfo() {
        return "TRUCK:" ;
    }
}
