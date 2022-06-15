/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import basic.Staff;
import mylib.Validation;
/**
 *
 * @author Admin
 */
public class Tester2 {

    public static void main(String[] args) {
        Staff x = null;
        int c = 0;
        do {
            System.out.println("1. create staff");
            System.out.println("2. create manager");
            System.out.println("3. output staff");
            try {
                c = (int) Validation.inputNumber("Input 1..2", 1, 3);
            } catch (Exception e) {
                System.out.println("Error");
            }
        } while (c <= 3);
        switch (c) {
            case 1 -> {
            }
            case 2 -> {
            }
            default -> throw new AssertionError();
        }
    }
}
