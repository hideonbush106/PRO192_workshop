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
        System.out.print("Input creator: ");
        creator = sc.nextLine();
        System.out.print("Input value: ");
        sc = new Scanner(System.in);
        value = sc.nextInt();
    }

    public void ouput() {
        System.out.println("Creator: " + creator);
        System.out.println("Value: " + value);
    }
}
