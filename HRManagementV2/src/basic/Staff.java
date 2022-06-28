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
public class Staff {

    int id;
    private String name;
    private String gender;
    private int basicSalary;
    private Task[] toDoList;
    private int noOfTasks;
    final int MAX = 100;

    public Staff() {
        id = 0;
        name = "";
        gender = "";
        basicSalary = 0;
        toDoList = new Task[MAX];
        noOfTasks = 0;
    }

    public Staff(int id, String name, String gender, int basicSalary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Task[] getToDoList() {
        return toDoList;
    }

    public void setToDoList(Task[] toDoList) {
        this.toDoList = toDoList;
    }

    public int getNoOfTasks() {
        return noOfTasks;
    }

    public void setNoOfTasks(int noOfTasks) {
        this.noOfTasks = noOfTasks;
    }

    public void inputStaff() {
        try {
            id = (int) Validation.inputNumber("Input ID: ", 1, 100);
            name = Validation.inputString("Input name: ", "^[a-zA-Z ]+$");
            gender = Validation.inputString("Input gender [M/F]: ", "^[FM ]+$");
            basicSalary = (int) Validation.inputNumber("Input basic salary(1-100): ", 1, 100);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + gender + "-" + basicSalary;
    }

//    public void outputStaff() {
//        System.out.println(id + "-" + name + "-" + gender + "-" + basicSalary);
//    }
    public boolean assignTask(Task t) {
        if (noOfTasks < MAX) {
            toDoList[noOfTasks] = t;
            noOfTasks++;
            t.addTaskToStaff(this);
            return true;
        }
        return false;
    }

    public void displayToDolist() {
        if (noOfTasks > 0) {
            for (Task task : toDoList) {
                if (task == null) {
                    break;
                } else {
                    System.out.println(task.toString());
                }
            }
        } else {
            System.out.println("No task yet");
        }
    }

}
