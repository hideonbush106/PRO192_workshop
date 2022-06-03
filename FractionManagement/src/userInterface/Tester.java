/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface;
import basic.Fraction;
/**
 *
 * @author Asus
 */
public class Tester {
    public static void main(String[] args) {
        double frac1;
        double frac2;
        //object cho phan so 1
        Fraction b = new Fraction();
        Fraction c = new Fraction();
        Fraction d = new Fraction();
        b.userInput();
        frac1 = b.fractionCombine();
        b.userOutput();
        
        //object cho phan so 2
        
        c.userInput();
        frac2 = c.fractionCombine();
        c.userOutput();
        
        //object cho phep tinh
        
        d.calculateOutput(frac1, frac2);
    }
}