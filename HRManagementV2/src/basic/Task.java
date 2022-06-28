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
public class Task {

    int id;
    private String title;
    private Staff[] assignedStaffList;
    private int noOfStaffs;
    final int MAX = 100;

    public Task() {
        id = 0;
        title = "";
        assignedStaffList = new Staff[MAX];
        noOfStaffs = 0;
    }

    public Task(int id, String title, Staff[] assignedStaffList, int noOfStaffs) {
        this.id = id;
        this.title = title;
        this.assignedStaffList = assignedStaffList;
        this.noOfStaffs = noOfStaffs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Staff[] getAssignedStaffList() {
        return assignedStaffList;
    }

    public void setAssignedStaffList(Staff[] assignedStaffList) {
        this.assignedStaffList = assignedStaffList;
    }

    public int getNoOfStaffs() {
        return noOfStaffs;
    }

    public void setNoOfStaffs(int noOfStaffs) {
        this.noOfStaffs = noOfStaffs;
    }

    public void inputTask() {
        try {
            title = Validation.inputString("Input task's title: ", "^[a-zA-Z ]+$");
            id = (int) Validation.inputNumber("Input task's ID: ", 1, 100);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return id + "-" + title;
    }

    public boolean addTaskToStaff(Staff s) {
        if (noOfStaffs < MAX) {
            assignedStaffList[noOfStaffs] = s;
            noOfStaffs++;
            return true;
        }
        return false;
    }

    public void displayAllAssginedStaffList() {
        if (noOfStaffs > 0) {
            for (Staff staff : assignedStaffList) {
                if (staff == null) {
                    break;
                } else {
                    System.out.println(staff.toString());
                }
            }
        } else {
            System.out.println("Empty assigned staff");
        }
    }

}
