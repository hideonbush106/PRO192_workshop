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
public class Item {

    int value;
    String creator;

    public Item() {
        this.value = 0;
        this.creator = "";
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    //getters
    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    //setter
    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the value: ");
            value = sc.nextInt();
        } while (value <= 0);
        do {
            sc = new Scanner(System.in);
            System.out.print("Enter the creator: ");
            creator = sc.nextLine();
        } while (creator.isEmpty());
    }

    public void ouput() {
        System.out.println("Creator: " + creator);
        System.out.println("Value: " + value);
    }
}
