package com.company;

import java.util.Scanner;

public class Rectangle extends Shape{
    public double rectangle_area(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and width of this rectangle");
        int length = scan.nextInt();
        int width = scan.nextInt();
        return length*width;
    }
}
