/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Admin
 */
public class AirCondition implements KoreaRemote {

    @Override
    public void subtitle(String language) {
        System.out.println("Display " + language);
    }

    @Override
    public void onDevice() {
        System.out.println("On AC");
    }

    @Override
    public void offDevice() {
        System.out.println("Off AC");
    }

    public static void main(String[] args) {
        KoreaRemote re = new AirCondition();
        re.onDevice();
        re.offDevice();
        re.setLock();
    }

}
