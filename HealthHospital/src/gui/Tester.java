/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import basic.Owner;
import basic.Pet;
import basic.Service;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tester {

    public static void main(String[] args) {
        int c = 0;
        Service s1 = null;
        Service s2 = null;
        Owner customer = null;
        Pet pet = null;
        do {
            System.out.println("1. Create 2 services");
            System.out.println("2. Create customers information and their pets");
            System.out.println("3. Choose service");
            System.out.println("4. Export bill");
            System.out.print("Choose 1..4: ");
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();
            switch (c) {
                case 1 -> {
                    s1 = new Service();
                    s1.input();
                    System.out.println("Done");
                }
                case 2 -> {
                    customer = new Owner();
                    customer.input();
                }
                case 3 -> {
                    System.out.println("1. Service 1: ");
                    System.out.println("2. Service 2: ");
                    System.out.print("Input service [1/2]: ");
                    int c2 = sc.nextInt();
                    switch (c2) {
                        case 1 -> {
                            if (s1 != null && pet != null) {
                                pet.setUsedService(s1);
                            } else {
                                System.out.println("No data");
                            }
                        }
                        case 2 -> {
                            if (s2 != null && pet != null) {
                                pet.setUsedService(s2);
                            } else {
                                System.out.println("No data");
                            }
                        }
                        default ->
                            throw new AssertionError();
                    }
                }
                case 4 -> {
                    if (customer != null) {
                        System.out.println("---------------Pet Hospital---------------");
                        customer.output();
                    } else {
                        System.out.println("No data");
                    }
                }
                default ->
                    throw new AssertionError();
            }
        } while (c <= 4);
    }
}
