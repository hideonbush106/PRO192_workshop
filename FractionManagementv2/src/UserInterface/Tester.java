/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;

import basic.Fraction;

/**
 *
 * @author Asus
 */
public class Tester {

    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.userInput();
        Fraction b = new Fraction();
        b.userInput();
        Fraction c = new Fraction(); //for sum
//      c = a.fractionSum(b.tuSo, b.mauSo);
        c = a.fractionSum(b);
        System.out.print("Sum is ");
        c.userOutput();

        Fraction d = new Fraction(); //for sub
        d = a.fractionSub(b.tuSo, b.mauSo);
//        d = a.fractionSub(b);
        System.out.print("Subtraction is ");
        d.userOutput();

        Fraction e = new Fraction(); //for multiply
        e = a.fractionMul(b.tuSo, b.mauSo);
//        e = a.fractionMul(b);
        System.out.print("Product is ");
        e.userOutput();

        Fraction f = new Fraction();
        f = a.fractionDiv(b);
//        f = a.fractionDiv(b.tuSo, b.mauSo);
        System.out.print("Division is ");
        f.userOutput();
    }
}
