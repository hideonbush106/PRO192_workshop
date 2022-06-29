/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import basic.Owner;
import basic.Service;
import basic.ServiceList;
import basic.Pets;
import java.util.Scanner;
import mylib.Menu;

/**
 *
 * @author Admin
 */
public class Tester {

    public static void main(String[] args) {
        String[] options = {" Input customer's information.",
            " Add customer's pet's information.",
            " Add 1 service in service list.",
            " Display service list.",
            " Choose service for customer's pet.",
            " Display customer's pets"};
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Owner owner = new Owner();
        ServiceList servicelist = new ServiceList();
        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1 -> {
                    owner.inputOwner();
                }
                case 2 -> {
                    Pets pets = new Pets();
                    pets.inputPets();
                    if (pets != null) {
                        owner.addPets(pets);
                        System.out.println("Done");
                    } else {
                        System.out.println("Customer empty");
                    }
                }
                case 3 -> {
                    Service service = new Service();
                    service.inputService();
                    if (servicelist.addService(service)) {
                        System.out.println("Added service to the service list");
                    } else {
                        System.out.println("Not add");
                    }
                }
                case 4 -> {
                    servicelist.displayAll();
                }
                case 5 -> {
                    servicelist.displayAll();
                    System.out.print("Please input service ID your pet wants to use: ");
                    int serviceID = sc.nextInt();
                    System.out.print("Please input pet ID use want to use on: ");
                    int petID = sc.nextInt();
                    Service s = servicelist.findService(serviceID);
                    Pets p = owner.findPets(petID);
                    if (s != null && p != null) {
                        s.serviceIsUsed(p);
                        System.out.println("Thank you!!!");
                    } else {
                        System.out.println("Not found");
                    }
                }
                case 6 -> {
                    owner.displayAllPets();
                }
            }
        } while (choice <= 6);
    }
}
