/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface;

import basic.Student;

/** 
 *
 * @author Asus
 */
public class Tester {
    public static void main(String[] args) {
        // tao object sv thu 1
//        Student b=new Student();
//        b.userInput();
//        b.userOutput();
        
        Student c=new Student(456, "Phong", "male");
        c.setName("Anh");
        c.userOutput();
    }
}
