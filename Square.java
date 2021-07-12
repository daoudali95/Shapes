package com.company;

import java.util.Scanner;

public class Square extends Shape {

    public double square_area(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of it's sides");
        int length = scan.nextInt();
        return length*length;
    }

}
