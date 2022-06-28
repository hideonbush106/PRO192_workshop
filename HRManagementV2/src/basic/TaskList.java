/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author Admin
 */
public class TaskList {

    private Task[] list;
    int count;
    final int MAX = 100;

    public TaskList() {
        list = new Task[MAX];
        count = 0;
    }

    public TaskList(Task[] list, int count) {
        this.list = list;
        this.count = count;
    }

    public Task[] getList() {
        return list;
    }

    public void setList(Task[] list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean addTask(Task t) {
        if (count < MAX) {
            list[count] = t;
            count++;
            return true;
        }
        return false;
    } //note: undone

    public Task findTask(int id) {
        for (int i = 0; i < count;i++) {
            if (list[i].getId() == id) {
                return list[i];
            }
        }
        return null;
    }

    public boolean updateTask(int id) {
        return false;
    } //note: undone

    public boolean removeTask(int id) {
        return false;
    } //note: undone

    public void sortTaskById() {

    } //note: undone

    public void displayAll() {
        System.out.println("The staffs list: ");
        for (Task task : list) {
            if (task == null) {
                break;
            } else {
                System.out.println(task.toString());
            }
        }
    }

}
