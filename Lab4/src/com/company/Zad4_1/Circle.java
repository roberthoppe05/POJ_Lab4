package com.company.Zad4_1;

public class Circle {
    private double radius = 1;
    private String color = "blue";


    public Circle() {
        radius = 1;
        color = "blue";
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: " +
                " radius " + radius +
                " color= " + color;
    }
}
