/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author Asus
 */

public class Point {
    double x, y;
    public void userInput() {
        Scanner a = new Scanner(System.in);
        System.out.print("Input x-axis: ");
        x = a.nextInt();
        System.out.print("Input y-axis: ");
        y = a.nextInt();
    }
    //method output
    public void userOutput() {
        System.out.println("Inputted point: (" + x + ";" + y + ")");
    }

    public double distance(Point P) {
        return Math.sqrt(Math.pow((x - P.x), 2) + Math.pow((y - P.y), 2));
    }
}