/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author Admin
 */
public class ServiceList {

    private int count;
    private Service[] list;
    final int MAX = 100;

    public ServiceList(int count, Service[] list) {
        this.count = count;
        this.list = list;
    }

    public ServiceList() {
        count = 0;
        list = new Service[MAX];
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Service[] getList() {
        return list;
    }

    public void setList(Service[] list) {
        this.list = list;
    }

    public boolean addService(Service s) {
        if (count < MAX) {
            list[count] = s;
            count++;
            return true;
        }
        return false;
    }

    public Service findService(int id) {
        for (int i = 0; i < count;i++) {
            if (list[i].getId() == id) {
                return list[i];
            }
        }
        return null;
    }

    public boolean updateService(int id) {
        return false;
    } //note: undone

    public boolean removeService(int id) {
        return false;
    } //note: undone

    public void sortServiceById() {

    } //note: undone

    public void displayAll() {
        System.out.println("The service list: ");
        for (Service service : list) {
            if (service == null) {
                break;
            } else {
                System.out.println(service.toString());
            }
        }
    }
    
}
