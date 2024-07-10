package org.example.oop;

public class Main {
    public static void main(String[] args) {
        Monitor lgMonitor = new Monitor(24d, "LG", "white","LED");
        Monitor samsungMonitor = new Monitor();

//        samsungMonitor.isOn = true;
        boolean myMonitorIsOn = samsungMonitor.isOn;

//        samsungMonitor.monitorIsOn(myMonitorIsOn);
//
//
//        samsungMonitor.doSound();
//
//        samsungMonitor.monitorIsOn(false);


//        System.out.println(samsungMonitor.color);
//        System.out.println(samsungMonitor.brand);
        System.out.println(samsungMonitor.isOn);
        System.out.println(lgMonitor.isOn);





    }
}
