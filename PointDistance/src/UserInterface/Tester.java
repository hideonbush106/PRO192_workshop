/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;

import basic.Point;

/**
 *
 * @author Asus
 */
public class Tester {
    public static void main(String[] args) {

        Point a = new Point();
        a.userInput();
        a.userOutput();

        Point b = new Point();
        b.userInput();
        b.userOutput();

        double d = b.distance(a);
        System.out.println("The distance: " + d);
    }
}
