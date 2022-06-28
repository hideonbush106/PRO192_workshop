/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dto;

/**
 *
 * @author Admin
 */
public interface VNRemote {

    final int MAXofButtons = 20;
    int price = 10;

    public static void setTimer(int number) {
        System.out.println("Shutdown after" + number + "seconds");
    }

    void onDevice();

    void offDevice();

    default void setLock() {
        System.out.println("Set lock in the default method.");
    }
}
