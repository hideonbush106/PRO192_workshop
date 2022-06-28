/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Admin
 */
public class Plant extends LivingBeing {

    private int year;

    public Plant() {
        super();
        year = 0;
    }

    public Plant(int year, String name) {
        super(name);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void useWater() {
        super.useWater();
    }

    @Override
    public void grow() {
        System.out.println("By light");
    }

}
