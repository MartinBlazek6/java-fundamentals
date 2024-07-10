package org.example.oop.pcHw;

public class Store {
    public static void main(String[] args) {


     //  Trieda    !=    objekt                             konstruktor
        MotherBoard    motherBoard = new MotherBoard("MSI", "Intel", "Nvidia", new Integer[]{4, 4}, 20d, 2);


//        MotherBoard motherBoard2 = new MotherBoard("MSI", "AMD", "Nvidia", new Integer[]{4, 4}, 20d, 2);
        MotherBoard motherBoard2 = MotherBoard.builder()
                .brand("MSI")
                .CPU("Intel")
                .GPU("Nvidia")
                .ram(new Integer[] {4,4})
                .size(20d)
                .build();

//        Ventilator ventilator = new Ventilator(6000,15d,600d,true);
        Ventilator ventilator = Ventilator.builder()
                .rpm(6000)
                .power(600d)
                .isLed(true)
                .build();

        Case pcCase = Case.builder()
                .material("glass")
                .motherBoard(motherBoard2)
                .color("blue")
                .fan(ventilator)
                .build();


        System.out.println(pcCase.toString());

    }
}
