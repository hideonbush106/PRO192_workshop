/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;

/**
 *
 * @author Asus
 */
public class Guitar {
    String serialNumber;
    int price;
    String builder;
    String model;
    String backWood;
    String topWood;
    Guitar(){};
    Guitar(String SerialNumber, int Price, String Builder, String Model, String BackWood, String TopWood) {
        serialNumber = SerialNumber;
        price = Price;
        builder = Builder;
        model = Model;
        backWood = BackWood;
        topWood = TopWood;
    }
    
    
        //setters
        public String getSerialNumber() {
            return serialNumber;
        }
        
        public int getPrice() {
            return price;
        }
        
        public String getBuilder() {
            return builder;
        }
        
        public String getModel() {
            return model;
        }
        
        public String getBackWood() {
            return backWood;
        }
        
        public String getTopWood() {
            return topWood;
        }
        
        
        //getter
        public void setSerialNumber(String SerialNumber) {
            serialNumber = SerialNumber;
        }
        
        public void setPrice(int Price) {
            price = Price;
        }
        
        public void setBuilder(String Builder) {
            builder = Builder;
        }
        
        public void setModel(String Model) {
            model = Model;
        }
        
        public void setBackWood(String BackWood) {
            backWood = BackWood;
        }
        
        public void setTopWood(String TopWood) {
            topWood = TopWood;
        }
        
        public void createSound() {
            System.out.println("Serial Number: " + serialNumber);
            System.out.println("Price: " + price);
            System.out.println("Builder: " + builder);
            System.out.println("Model: " + model);
            System.out.println("Back wood: " + backWood);
            System.out.println("Top wood: " + topWood);
        }
        
    }
