/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Asus
 */
public class BeeColony extends Colony implements Role {

    String type;

    public BeeColony() {
        super();
        type = "";
    }

    public BeeColony(int size, String type, String place) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "The colony’s type is " + type + ", size is about " + super.size + ", and the place is " + super.place;
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
}
