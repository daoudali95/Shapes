package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class User extends Shape {
    public static void main(String[] args) {
        double radius_value = 0;
        double square_area = 0;
        double rectangle_area = 0;
        List<String> colors_list = Arrays.asList(args);
        Scanner scan = new Scanner(System.in);
//        User user_obj = new User();
        System.out.println("       Shapes");
        String[] shapes = {" ","Circle","Square","Rectangle"};
        for (int i=1; i<shapes.length; i++){
            System.out.print(i + ") "+shapes[i]+"  ");
        }
        System.out.println();
        System.out.println("Which shape you want to choose?");
        int shape_input = scan.nextInt();
//if user select circle
        if (shape_input == 1) {
            Circle circle_obj = new Circle();
            System.out.println("Do you want to add color to this circle?");
            System.out.println("Enter 1 for yes and enter 0 for no");
            int color_input = scan.nextInt();
            if (color_input == 1){
                colors_list = circle_obj.Color();
                System.out.println("Do you want to find Radius of this circle?");
                System.out.println("Enter 1 for yes and 0 for No");
                int radius_input = scan.nextInt();
                if (radius_input==1){
                    radius_value = circle_obj.circle_radius();
                }
            }
            else if (color_input==0){
                System.out.println("Do you want to find Radius of this circle?");
                System.out.println("Enter 1 for yes and 0 for No");
                int radius_input = scan.nextInt();
                if (radius_input==1){
                    radius_value = circle_obj.circle_radius();
                }
                else if (radius_input==0){
                    System.exit(0);
                }
            }
            System.out.println("       Circle");
            System.out.println("Colors selected: "+colors_list);
            System.out.println("Radius of this circle: "+radius_value);
        }
//if user select square
        if (shape_input == 2) {
            Square square_obj = new Square();
            System.out.println("Do you want to add color to this square?");
            System.out.println("Enter 1 for yes and enter 0 for no");
            int color_input = scan.nextInt();
            if (color_input == 1){
                colors_list = square_obj.Color();
                System.out.println("Do you want to find Area of this square?");
                System.out.println("Enter 1 for yes and 0 for No");
                int area_input = scan.nextInt();
                if (area_input==1){
                    square_area = square_obj.square_area();
                }
            }
            else if (color_input==0){
                System.out.println("Do you want to find Area of this square?");
                System.out.println("Enter 1 for yes and 0 for No");
                int area_input = scan.nextInt();
                if (area_input==1){
                    square_area = square_obj.square_area();
                }
                else if (area_input==0){
                    System.exit(0);
                }
            }
            System.out.println("       Square");
            System.out.println("Colors selected: "+colors_list);
            System.out.println("Area of this square: "+square_area);
        }
//if user select rectangle
        if (shape_input == 3) {
            Rectangle rectangle_obj = new Rectangle();
            System.out.println("Do you want to add color to this rectangle?");
            System.out.println("Enter 1 for yes and enter 0 for no");
            int color_input = scan.nextInt();
            if (color_input == 1){
                colors_list = rectangle_obj.Color();
                System.out.println("Do you want to find Area of this rectangle?");
                System.out.println("Enter 1 for yes and 0 for No");
                int area_input = scan.nextInt();
                if (area_input==1){
                    rectangle_area = rectangle_obj.rectangle_area();
                }
            }
            else if (color_input==0){
                System.out.println("Do you want to find Area of this rectangle?");
                System.out.println("Enter 1 for yes and 0 for No");
                int area_input = scan.nextInt();
                if (area_input==1){
                    rectangle_area = rectangle_obj.rectangle_area();
                }
                else if (area_input==0){
                    System.exit(0);
                }
            }
            System.out.println("       Rectangle");
            System.out.println("Colors selected: "+colors_list);
            System.out.println("Area of this rectangle: "+rectangle_area);
        }

    }
}
