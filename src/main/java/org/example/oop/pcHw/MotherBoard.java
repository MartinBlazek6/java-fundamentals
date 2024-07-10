package org.example.oop.pcHw;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MotherBoard {
    private String brand;
    private String CPU;
    private String GPU;
    private Integer[] ram;
    private Double size;
    private Integer usbPorts;

    public MotherBoard(String brand, String CPU, String GPU, Integer[] ram, Double size, Integer usbPorts) {
        this.brand = brand;
        this.CPU = CPU;
        this.GPU = GPU;
        if (ram.length > 2) {
            System.out.println("Nemam tolko slotov");
        } else {
            this.ram = ram;
        }
        this.size = size;
        this.usbPorts = usbPorts;
    }
}
