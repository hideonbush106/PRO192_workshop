/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Statue extends Item{
    int weight;
    String colour;
    public Statue(){
        super();
    }
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }
    
    //setters
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    //getter
    
    public int getWeight() {
        return weight;
    }
    
    public String getColour() {
        return colour;
    }
    
    public void inputStatue() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Input weight: ");
        weight = sc.nextInt();
        System.out.print("Input colour: ");
        sc = new Scanner(System.in);
        colour = sc.nextLine();
    }
    
    public void outputStatue() {
        super.ouput();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}
