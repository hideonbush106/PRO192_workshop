/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import dto.BeeColony;
import dto.Colony;
import dto.FPTUniversity;
import dto.University;
import dto.Role;

/**
 *
 * @author Asus
 */
public class Tester {

    public static void main(String[] args) {
        Colony obj1 = new BeeColony(2000, "honey", "land");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();
        University obj2 = new FPTUniversity(100000, "FPT", "Cantho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();

        Role df = new BeeColony(3000, "wasp", "land");
        System.out.println(df);
        df.createWorker();

        df = new FPTUniversity(100000, "FPT", "Hanoi");
        System.out.println(df);
        df.createWorker();

    }
}
