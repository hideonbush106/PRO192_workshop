
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Part2 {
    public static void main(String[] args) {
        float num1, num2;
        String op;
        Scanner c = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        num1 = c.nextFloat();
        System.out.println("Input 2nd number: ");
        num2 = c.nextFloat();
        System.out.println("Input operator: ");
        c = new Scanner(System.in);
        op = c.nextLine();
        switch (op) {
            case "+" -> System.out.println("Result of " + num1 + " + " + num2 + " is " + (num1 + num2));
            case "-" -> System.out.println("Result of " + num1 + " - " + num2 + " is " + (num1 - num2));
            case "*" -> System.out.println("Result of " + num1 + " * " + num2 + " is " + (num1 * num2));
            case "/" -> {
                    if (num2 == 0) System.out.println("Math error");
                    else System.out.println("Result of " + num1 + " / " + num2 + " is " + (num1 / num2));
                }
                
            default -> System.out.println("Invalid operator.");
        }
    }
}