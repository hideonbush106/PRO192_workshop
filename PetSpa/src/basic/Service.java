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
public class Service {

    private int id;
    private String name;
    private int price;
    private int noOfPets;
    private Pets[] petOptionCount;
    final int MAX = 100;

    public Service() {
        id = 0;
        name = "";
        price = 0;
        noOfPets = 0;
        petOptionCount = new Pets[MAX];
    }

    public Service(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void inputService() {
        try {
            id = (int) Validation.inputNumber("Input service's ID: ", 1, 500);
            name = Validation.inputString("Input service name: ", "^[a-zA-Z ]+$");
            price = (int) Validation.inputNumber("Input price: ", 1, 500);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + price;
    }

    public boolean serviceIsUsed(Pets pets) {
        if (noOfPets < MAX) {
            petOptionCount[noOfPets] = pets;
            noOfPets++;
            pets.petOptionCount(this);
            return true;
        }
        return false;
    }

}
