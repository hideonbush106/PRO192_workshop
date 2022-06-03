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
        Scanner c=new Scanner(System.in);
        System.out.println("Input student ID: ");
        id = c.nextInt();
        c=new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = c.nextLine();
        c=new Scanner(System.in);
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
