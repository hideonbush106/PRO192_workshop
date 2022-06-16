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
public class Circle extends Point {

    protected double r;
    protected Point point;

    public Circle() {
        r = 0.0;
        point = new Point();
    }

    public Circle(double r, Point point) {
        this.r = r;
        this.point = point;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRelationship(Circle C) {
        double distance = C.point.getDistance(point);
        double sumR = C.r + r;
        double subR = Math.abs(C.r - r);
        if (sumR == distance) {
            return 1; //tiep xuc ngoai (Circumscribed)
        } else if (distance == 0) {
            return 2; // dong tam (Concentric)
        } else if (distance > sumR) {
            return 3; // xa nhau (Separated)
        } else if (distance == subR) {
            return 4; // tiep xuc trong  (Inscribed)
        } else if (distance < subR) {
            return 5; // o trong nhau (Included)
        } else return 6; // giao nhau (Intersected)
    }

    public void input() {
        boolean cont = true;
        Scanner sc = null;
        do {
            try {
                System.out.print("Input radius: ");
                sc = new Scanner(System.in);
                r = sc.nextDouble();
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("Error");
            }
        } while (!cont);
    }

    public void output() {
        System.out.println("The radius is " + r);
    }
}
