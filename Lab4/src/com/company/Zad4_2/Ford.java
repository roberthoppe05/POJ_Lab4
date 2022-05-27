package com.company.Zad4_2;

public class Ford extends Car implements Purchase{
    private int year;
    private int manufactureDiscount;

    @Override
    public double getSalePrice(){
        return super.getSalePrice()-manufactureDiscount;
    }


    public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    @Override
    public String getPurchaseInfo() {
        return "FORD:";
    }

}
