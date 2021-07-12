package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Circle extends Shape {
    Scanner scan = new Scanner(System.in);

    public double circle_radius() {
        System.out.println("Enter circumference of this circle");
        int circum = scan.nextInt();
        double r = circum / (2 * 3.14);
        return r;
    }
}
