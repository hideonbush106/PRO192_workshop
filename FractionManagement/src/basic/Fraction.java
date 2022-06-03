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
public class Fraction {
    int tuSo;
    int mauSo;
    //method input
    public void userInput() {
        Scanner a = new Scanner(System.in);
        System.out.print("Input numerator: ");
        tuSo = a.nextInt();
        System.out.print("Input denominator: ");
        mauSo = a.nextInt();
    }
    //method output
    public void userOutput() {
        System.out.println("Inputted fraction: " + tuSo + "/" + mauSo);
    }
    
    public double fractionCombine () {
        double fraction = (tuSo * 1.0 / mauSo);
        return fraction;
    }

    //method calculate
    public void calculateOutput(double frac1, double frac2) {
        System.out.println("Sum is: " + (frac1 + frac2));
        System.out.println("Subtraction is: " + (frac1 - frac2));
        System.out.println("Multiply is: " + (frac1 * frac2));
        System.out.println("Division is: " + (frac1 / frac2));
    }
    
}