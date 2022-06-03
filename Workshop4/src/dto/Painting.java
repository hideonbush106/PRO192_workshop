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
public class Painting extends Item{
    int height;
    int width;
    boolean isWaterColour;
    boolean isFramed;
    public Painting(){
        super();
        height = 0;
        width = 0;
        isWaterColour = false;
        isFramed = false;
        }
    public Painting(int value, String creator, int height, int width, boolean isWaterColour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }
    
    //setters
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }
    
    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    //getter
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public boolean getIsWaterColour() {
        return isWaterColour;
    }
    
    public boolean getIsFramed() {
        return isFramed;
    }
    
    public void inputPainting() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Input height: ");
        height = sc.nextInt();
        System.out.print("Input width: ");
        width = sc.nextInt();
        System.out.print("Is water colour: ");
        isWaterColour = sc.nextBoolean();
        System.out.print("Is framed: ");
        isFramed = sc.nextBoolean();
    }
    
    public void outputPainting() {
        super.ouput();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Is water colour: " + isWaterColour);
        System.out.println("Is framed: " + isFramed);
    }
}
