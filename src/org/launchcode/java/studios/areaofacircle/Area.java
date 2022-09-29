package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.printf("The area of a circle of radius %f is: %f", radius, area);
    }
}
