/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Admin
 */
public class Laptop {

    int id;
    String name;
    int price;
    USBport port;

    public Laptop() {
        id = 0;
        name = "";
        price = 0;
        port = new USBport();
    }

    public Laptop(int id, String name, int price, USBport port) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.port = port;
    }

    private static class USBport {

        String brand;
        String technology;

        public USBport() {
            brand = "";
            technology = "";
        }

        public USBport(String brand, String technology) {
            this.brand = brand;
            this.technology = technology;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getTechnology() {
            return technology;
        }

        public void setTechnology(String technology) {
            this.technology = technology;
        }

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

    public USBport getPort() {
        return port;
    }

    public void setPort(USBport port) {
        this.port = port;
    }

    public void onLaptop() {
        VNRemote remote = new VNRemote() {
            @Override
            public void onDevice() {
                System.out.println("Starting device");
            }

            @Override
            public void offDevice() {
                System.out.println("Shut down device");
            }
        };
        remote.onDevice();
        System.out.println("Have a nice day");
    }

    @Override
    public String toString() {
        return "Laptop " + name + " " + id + ". The price is: " + price + ". It use " + port.brand + " USB port, the technology is " + port.technology;
    }

    public static void main(String[] args) {
        USBport obj1 = new USBport("Kingston", "Type-C");
        Laptop obj = new Laptop(325, "Asus", 19500000, obj1);
        System.out.println(obj);
        obj.onLaptop();
    }

}
