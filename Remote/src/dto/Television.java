/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Admin
 */
public class Television implements VNRemote, ChinaRemote {

    @Override
    public void onDevice() {
        System.out.println("On TV");
    }

    @Override
    public void offDevice() {
        System.out.println("Off TV");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increase volume");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decrease volume");
    }

    public static void main(String[] args) {
        VNRemote remote = new Television();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        VNRemote.setTimer(10000);
        System.out.println("TV remote's price: " + VNRemote.price);
        System.out.println("TV remote has: " + VNRemote.MAXofButtons + "buttons");
    }

}
