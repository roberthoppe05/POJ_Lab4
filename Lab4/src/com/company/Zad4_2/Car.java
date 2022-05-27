package com.company.Zad4_2;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public double getSalePrice() {
        return regularPrice;
    }

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }


}
