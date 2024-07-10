package org.example.oop;

public class Monitor {
    Double size; //resolution
    String brand;
    String color;
    String type ;
    boolean isOn;

    public Monitor(Double size, String brand, String color, boolean isOn) {
        this.size = size;
        this.brand = brand;
        this.color = color;
        this.isOn = isOn;
        this.type = "LCD";
    }

    public Monitor(Double size, String brand, String color, String type) {
        this.size = size;
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public Monitor() {}

    void monitorIsOn(boolean isOnParam) {
        if (isOnParam) {
            System.out.println("No signal");
        } else {
            System.out.println("...");
        }
    }

    void doSound() {
        System.out.println("beep");
    }
}
