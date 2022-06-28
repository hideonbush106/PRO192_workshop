/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import mylib.Menu;
import basic.Manager;
import basic.Staff;
import basic.Task;
import basic.TaskList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tester {

    public static void main(String[] args) {
        String[] options = {" Create a manager.", " Add 1 staff in manager.", " Add 1 task in task list.", " Display task list.", " Assign task to staff.", " Display manager's staff list"};
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        TaskList tasklist = new TaskList();
        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1 -> {
                    manager.inputStaff();
                }

                case 2 -> {
                    Staff staff = new Staff();
                    staff.inputStaff();
                    if (manager != null) {
                        manager.addStaff(staff);
                        System.out.println("Done");
                    } else {
                        System.out.println("Manager empty");
                    }
                }

                case 3 -> {
                    Task task = new Task();
                    task.inputTask();
                    if (tasklist.addTask(task)) {
                        System.out.println("Added task to the task list");
                    } else {
                        System.out.println("Not add");
                    }
                }

                case 4 -> {
                    tasklist.displayAll();
                }

                case 5 -> {
                    if (manager != null) {
                        manager.displayAllStaffs();
                    }
                    tasklist.displayAll();
                    System.out.println("Please input task ID to assign: ");
                    int taskID = sc.nextInt();
                    System.out.println("Please input staff ID to assign: ");
                    int staffID = sc.nextInt();
                    Task t = tasklist.findTask(taskID);
                    Staff s = manager.findStaff(staffID); //make findTask in Manager.java
                    if (t != null && s != null) {
                        s.assignTask(t);
                        System.out.println("Assigned");
                    } else {
                        System.out.println("Not found");
                    }
                }

                case 6 -> {
                    manager.displayAllStaffs();
                }
                default ->
                    System.exit(0);
            }
        } while (choice <= 6);
    }
}
