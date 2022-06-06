/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Asus
 */
abstract public class Organization {

    protected int size;

    public Organization() {
        size = 0;
    }

    public Organization(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void communicateByTool();

    @Override
    public String toString() {
        return "the organization’s size is" + size;
    }
}
