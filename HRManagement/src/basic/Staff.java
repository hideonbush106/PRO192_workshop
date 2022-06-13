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
public class Staff {

    protected int id;
    protected String name;
    protected String gender;
    protected int basic;

    public Staff() {
        id = 0;
        name = "";
        gender = "";
        basic = 0;
    }

    public Staff(int id, String name, String gender, int basic) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basic = basic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public void inputStaff() {
        try {
            id = (int) Validation.inputNumber("Input ID: ", 1, 100);
            name = Validation.inputString("Input name: ", "^[a-zA-Z ]+$");
            gender = Validation.inputString("Input gender [M/F]: ", "^[FM ]+$");
            basic = (int) Validation.inputNumber("Input basic salary(1-100):", 1, 100);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void outputStaff() {
        System.out.print(id + "-" + name + "-" + gender + "-" + basic);
    }
}
