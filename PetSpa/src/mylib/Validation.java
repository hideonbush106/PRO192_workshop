package mylib;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    public static double inputNumber(String msg, double min, double max) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print(msg);
        double number = s.nextDouble();
        if (number < min || number > max) {
            throw new Exception();
        }
        return number;
    }

    public static String inputString(String msg, String pattern) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print(msg);
        String str = s.nextLine();
        if (!str.matches(pattern)) {
            throw new Exception();
        }
        return str;
    }
}
