/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import basic.Circle;
import basic.Point;

/**
 *
 * @author Admin
 */
public class Tester {

    public static void main(String[] args) {
        String[] options = {" Input 2 circles", " Print out circles", " Calculate point distance", " Circles relationship"};
        int choice = 0;
        Circle c1 = null;
        Circle c2 = null;
        Point p1 = null;
        Point p2 = null;
        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1 -> {
                    c1 = new Circle();
                    c2 = new Circle();
                    p1 = new Point();
                    p2 = new Point();
                    System.out.println("-----1st circle-----");
                    p1.input();
                    c1.input();
                    System.out.println("-----2nd circle-----");
                    p2.input();
                    c2.input();
                }
                case 2 -> {
                    if (c1 == null || c2 == null) {
                        System.out.println("Please input first");
                    } else {
                        System.out.println("-----1st circle-----");
                        p1.output();
                        c1.output();
                        System.out.println("-----2nd circle-----");
                        p2.output();
                        c2.output();
                    }
                }
                case 3 -> {
                    if (c1 == null && c2 == null) {
                        System.out.println("Please input first");
                    } else {
                        double distance = p1.getDistance(p2);
                        System.out.println("The distance is " + distance);
                    }
                }
                case 4 -> {
                    if (c1 == null && c2 == null) {
                        System.out.println("Please input first");
                    } else {
                        c1 = new Circle(c1.getR(),p1);
                        c2 = new Circle(c2.getR(),p2);
                        int result = c2.getRelationship(c1);
                        switch (result) {
                            case 1 -> {
                                System.out.println("Circumscribed (tiep xuc ngoai)");
                            }
                            case 2 -> {
                                System.out.println("Concentric (dong tam)");
                            }
                            case 3 -> {
                                System.out.println("Separated (khong giao nhau)");
                            }
                            case 4 -> {
                                System.out.println("Inscribed (tiep xuc trong)");
                            }
                            case 5 -> {
                                System.out.println("Included (dung nhau)");
                            }
                            case 6 -> {
                                System.out.println("Intersected (giao nhau)");
                            }
                        }
                    }
                }
                default ->
                    System.exit(0);
            }
        } while (choice <= 4);
    }
}
