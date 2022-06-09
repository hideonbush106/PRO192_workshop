/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Student {

    //field
    int id;
    String name;
    String gender;
    //

    //constructor
    public Student() {
        id = 0;
        name = "";
        gender = "";
    }

    public Student(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    //methods
    public void userInput() {
        Scanner c = null;
        boolean cont = false;
        do {
            try {
                c = new Scanner(System.in);
                System.out.println("Input student ID: ");
                id = c.nextInt();
                if (id < 0) {
                    throw new Exception();
                }
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("ID is number");
            } catch (Exception e) {
                System.out.println("ID must larger than 1");
            }
        } while (!cont);

        cont = false;

        do {
            try {
                c = new Scanner(System.in);
                System.out.println("Input name: ");
                name = c.nextLine();
                if (!name.matches("^[a-zA-Z]+([a-zA-Z ]+)")) {
                    throw new Exception();
                }
                cont = true;
            } catch (Exception e) {
                System.out.println("Invalid name");
            }
        } while (!cont);

        c = new Scanner(System.in);
        System.out.println("Input gender: ");
        gender = c.nextLine();
    }

    public void userOutput() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }
}
