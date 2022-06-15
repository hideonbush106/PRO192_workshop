/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author Admin
 */
public class Pet {
    private int id;
    private String name;
    private String gender;
    private String birthday;
    private Service usedService;

    public Pet() {
        id = 0;
        name = "";
        gender = "";
        birthday = "";
        usedService = new Service();
    }

    public Pet(int id, String name, String gender, String birthday, Service usedService) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.usedService = usedService;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Service getUsedService() {
        return usedService;
    }

    public void setUsedService(Service usedService) {
        this.usedService = usedService;
    }
    
    public void output() {
        System.out.format("%10d%20s%10s%20s", id, name, gender, birthday);
        usedService.output();
    }
    
    public void input() {}
}
