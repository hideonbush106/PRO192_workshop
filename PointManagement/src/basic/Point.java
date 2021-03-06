package basic;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Point {
    double x, y;
    
    public Point() {
        x = 0;
        y = 0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void userInput() {
        boolean cont = false;
        Scanner a = null;
        do {
            try {
                a = new Scanner(System.in);
                System.out.print("Input x-axis: ");
                x = a.nextInt();
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
            }
        } while (!cont);
        cont = false;
        do {
            try {
                a = new Scanner(System.in);
                System.out.print("Input y-axis: ");
                y = a.nextInt();
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
            }
        } while (!cont);

    }
    //method output
    public void userOutput() {
        System.out.println("Inputted point: (" + x + ";" + y + ")");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
        
    public double distance(Point P) {
        return Math.sqrt(Math.pow((x - P.x), 2) + Math.pow((y - P.y), 2));
    }
    
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }
}