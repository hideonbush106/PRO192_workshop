/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

/**
 *
 * @author Asus
 */
public class Car {
    String colour;
    int enginePower;
    boolean convertible;
    boolean parkingBrake;
    Car(){
        colour = "";
        enginePower = 0;
        convertible = false;
        parkingBrake = false;
    }
    Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }
    public String getColour() {
        return colour;
    }
    
    public int getEnginePower() {
        return enginePower;
    }
    
    public boolean getConvertible() {
        return convertible;
    }
    
    public boolean getParkingBrake() {
        return parkingBrake;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }
    
    public void pressStartButton () {
        System.out.println("You have press the start button");
    }
    
    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }
    
    public void output() {
        System.out.println("Car colour: " + colour);
        System.out.println("Car engine power: " + enginePower);
        System.out.println("Is convertible: " + convertible);
        System.out.println("Have parking brake: " + parkingBrake);
    }
}
