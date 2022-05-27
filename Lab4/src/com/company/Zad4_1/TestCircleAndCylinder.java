package com.company.Zad4_1;

public class TestCircleAndCylinder {
    public static void main(String[] args) {

        Circle cir1 = new Circle();
        Circle cir2 = new Circle(2);

        Cylinder cyr1 = new Cylinder();
        Cylinder cyr2 = new Cylinder(2);
        Cylinder cyr3 = new Cylinder(2, 2);

        System.out.println("Circle c1 Radius: " + cir1.getRadius() + " Area: " + cir1.getArea() + "\n" + cir1.toString());
        System.out.println("Circle c2 Radius: " + cir2.getRadius() + " Area: " + cir2.getArea() + "\n" + cir2.toString());


        System.out.println("Cylinder c1 Height: " + cyr1.getHeight() + " Rarius: " + cyr1.getRadius() + " Volume: " + cyr1.getVolume() + "\n" + cyr1.toString());
        System.out.println("Cylinder c2 Height: " + cyr2.getHeight() + " Rarius: " + cyr2.getRadius() + " Volume: " + cyr2.getVolume() + "\n" + cyr2.toString());
        System.out.println("Cylinder c3 Height: " + cyr3.getHeight() + " Rarius: " + cyr3.getRadius() + " Volume: " + cyr3.getVolume() + "\n" + cyr3.toString());

    }
}
