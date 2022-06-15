/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import basic.Manager;
import basic.Staff;

/**
 *
 * @author Admin
 */
public class Tester {
    public static void main(String[] args) {
        Staff x = new Staff();
        x.inputStaff();
        x.outputStaff();
        Manager y = new Manager();
        y.inputManager();
        y.outputManager();
        Staff z = new Manager();
        ((Manager)z).inputManager();
        ((Manager)z).outputManager();
    }
}
