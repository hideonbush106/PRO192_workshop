/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Point {

    protected double x;
    protected double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(Point P) {
        return Math.sqrt(Math.pow((x - P.x), 2) + Math.pow((y - P.y), 2));
    }

    public void input() {
        Scanner sc = null;
        boolean cont = false;
        do {
            try {
                System.out.print("Input x-axis: ");
                sc = new Scanner(System.in);
                x = sc.nextDouble();
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("Error");
            }
        } while (!cont);

        cont = false;
        
        do {
            try {
                System.out.print("Input y-axis: ");
                sc = new Scanner(System.in);
                y = sc.nextDouble();
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("Error");
            }
        } while (!cont);
    }
    
    public void output() {
        System.out.println("The centre point is (" + x + "; " + y + ")");
    }
}
