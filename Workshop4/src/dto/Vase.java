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
public class Vase extends Item {

    int height;
    String material;

    public Vase() {
        super();
        height = 0;
        material = "";
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    //setters
    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //getter
    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void inputVase() {
        Scanner sc = new Scanner(System.in);
        super.input();
        do {
            System.out.print("Input height: ");
            height = sc.nextInt();
        } while (height <= 0);

        do {
            System.out.print("Input material: ");
            sc = new Scanner(System.in);
            material = sc.nextLine();
        } while (material.isEmpty());
    }

    public void outputVase() {
        super.ouput();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}
