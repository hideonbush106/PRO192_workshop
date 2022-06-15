/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author Admin
 */
public class Owner {
    private int id;
    private String name;
    private String address;
    private Pet pet;

    public Owner() {
        id = 0;
        name = "";
        address = "";
        pet = new Pet();
    }

    public Owner(int id, String name, String address, Pet pet) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.pet = pet;
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    public void output () {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer name: " + name);
        System.out.println("Customer address: " + address);
        pet.output();
    }
    
    public void input() {
    
        pet.input();
    }
}
