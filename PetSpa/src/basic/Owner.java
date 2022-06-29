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
public class Owner {

    protected int id;
    protected String name;
    private String address;
    private int noOfPets;
    final int MAX = 100;
    private Pets[] petsList;

    public Owner() {
        id = 0;
        name = "";
        address = "";
        noOfPets = 0;
        petsList = new Pets[MAX];
    }

    public Owner(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputOwner() {
        try {
            id = (int) Validation.inputNumber("Input ID: ", 1, 500);
            name = Validation.inputString("Input name: ", "^[a-zA-Z ]+$");
            address = Validation.inputString("Input address: ", "^[a-zA-Z0-9 ]+$");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + address;
    }

    public boolean addPets(Pets pets) {
        if (noOfPets < MAX) {
            petsList[noOfPets] = pets;
            noOfPets++;
            return true;
        }
        return false;
    }

    public void displayAllPets() {
        if (noOfPets > 0) {
            System.out.println("The pet list: ");
            for (Pets pets : petsList) {
                if (pets == null) {
                    break;
                } else {
                    System.out.println(pets.toString());
                    pets.displayServiceUsed();
                }
            }
        } else {
            System.out.println("Empty");
        }
    }

    public Pets findPets(int id) {
        for (int i = 0; i < noOfPets; i++) {
            if (petsList[i].getPetId() == id) {
                return petsList[i];
            }
        }
        return null;
    }

}
