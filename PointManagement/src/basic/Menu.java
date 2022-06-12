package basic;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Menu {
    Point a = null;
    Point b = null;
    public void menu() {
        int userChoice;
        do {
        System.out.println("1. Input point.");
        System.out.println("2. Output point.");
        System.out.println("3. Print the distance between two point.");
        System.out.println("4. Exit.");
        System.out.println("--> Choose one: ");
        Scanner c = new Scanner(System.in);
        userChoice = c.nextInt();
        switch (userChoice) {
            case 1 -> {
                a = new Point();
                b = new Point();
                a.userInput();
                b.userInput();
            }
            case 2 -> {
                if (a != null) a.userOutput();
                if (b != null) b.userOutput();
                else {
                    System.out.println("No input\n");
                }
            }
            case 3 -> {
                if (a == null && b == null) System.out.println("Can not calculate distance\n");
                else {
                    double d = b.distance(a);
                    System.out.println("The distance is " + d + "\n");
                }
            }
            default -> System.exit(0);
            }
        } while (userChoice >= 1 && userChoice <= 4);
    }
}