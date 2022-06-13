/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import mylib.Validation;

/**
 *
 * @author Admin
 */
public class Manager extends Staff {

    private int bonus;

    public Manager() {
        super();
        bonus = 0;
    }

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    public Manager(int bonus, int id, String name, String gender, int basic) {
        super(id, name, gender, basic);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    public void inputManager() {
        inputStaff();
        try {
            bonus = (int) Validation.inputNumber("Input bonus (1-30): ", 1, 30);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    public void outputManager() {
        outputStaff();
        System.out.println("-" + bonus);
    }
}
