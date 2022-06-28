/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Admin
 */
abstract public class LivingBeing {

    String name;

    public LivingBeing() {
        name = "";
    }

    public LivingBeing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void useWater() {
        System.out.println("Used water");
    }

    public abstract void grow();

}
