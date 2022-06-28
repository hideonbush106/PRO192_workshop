/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Admin
 */
public class Animal extends LivingBeing {

    private String gender;

    public Animal() {
        super();
        gender = "";
    }

    public Animal(String gender, String name) {
        super(name);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void useWater() {
        super.useWater();
    }

    @Override
    public void grow() {
        System.out.println("By food");
    }

    public void run() {
        System.out.println("Run by foots");
    }

}
