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
public class Manager extends Staff {

    private int noOfStaffs;
    final int MAX = 100;
    private int bonusSalary;
    private Staff[] staffList;

    public Manager() {
        super();
        bonusSalary = 0;
        noOfStaffs = 0;
        staffList = new Staff[MAX];
    }

    public Manager(int id, String name, String gender, int basicSalary, int bonusSalary) {
        super(id, name, gender, basicSalary);
        this.bonusSalary = bonusSalary;
    }

    public Staff[] getStaffList() {
        return staffList;
    }

    public void setStaffList(Staff[] staffList) {
        this.staffList = staffList;
    }

    public int getNoOfStaffs() {
        return noOfStaffs;
    }

    public void setNoOfStaffs(int noOfStaffs) {
        this.noOfStaffs = noOfStaffs;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    @Override
    public void inputStaff() {
        super.inputStaff();
        try {
            bonusSalary = (int) Validation.inputNumber("Input bonus (1-30): ", 1, 30);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "-" + bonusSalary;
    }

    public boolean addStaff(Staff staff) {
        if (noOfStaffs < MAX) {
            staffList[noOfStaffs] = staff;
            noOfStaffs++;
            return true;
        } else {
            System.out.println("Error");
        }
        return false;
    }

    public void displayAllStaffs() {
        if (noOfStaffs > 0) {
            System.out.println("The staffs list: ");
            for (Staff staff : staffList) {
                if (staff == null) {
                    break;
                } else {
                    System.out.println(staff.toString());
                    staff.displayToDolist();
                }
            }
        } else {
            System.out.println("Empty");
        }
    }

    public Staff findStaff(int id) {
        for (int i = 0; i < noOfStaffs; i++) {
            if (staffList[i].getId() == id) {
                return staffList[i];
            }
        }
        return null;
    }

}
