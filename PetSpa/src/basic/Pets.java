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
public class Pets extends Owner {

    private int petId;
    private String petName;
    private String birthday;
    private String gender;
    private int noOfService;
    private Service[] serviceUsed;
    final int MAX = 100;

    public Pets() { 
        super();
        petId = 0;
        petName = "";
        birthday = "";
        gender = "";
        noOfService = 0;
        serviceUsed = new Service[MAX];
    }

    public Pets(int petId, String petName, String birthday, String gender, int id, String name, String address) {
        super(petId, name, address);
        this.petId = petId;
        this.petName = petName;
        this.birthday = birthday;
        this.gender = gender;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void inputPets() {
        try {
            petId = (int) Validation.inputNumber("Input your pet's ID: ", 1, 500);
            petName = Validation.inputString("Input your pet's name: ", "^[a-zA-Z ]+$");
            birthday = Validation.inputString("Input your pet's birthday: ", "^[0-9 ]+$");
            gender = Validation.inputString("Input your pet's gender [M/F]: ", "^[FM ]+$");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return petId + "-" + petName + "-" + birthday + "-" + gender;
    }

    public boolean petOptionCount(Service service) {
        if (noOfService < MAX) {
            serviceUsed[noOfService] = service;
            noOfService++;
            return true;
        }
        return false;
    }

    public void displayServiceUsed() {
        if (noOfService > 0) {
            for (Service service : serviceUsed) {
                if (service == null) {
                    break;
                } else {
                    System.out.println(service.toString());
                }
            }
        } else {
            System.out.println("No service yet");
        }
    }

}
