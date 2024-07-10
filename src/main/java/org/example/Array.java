package org.example;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] idCard = new String[3]; // Name, Address, Birth date

        do {
            System.out.println("Please enter your name with whitespace and it should contains more than 2 letters");
            idCard[0] = scanner.nextLine();
        } while (idCard[0].length() < 3 || !idCard[0].contains(" "));

        System.out.print("Your address please: ");
        idCard[1] = scanner.nextLine();

        do {
            System.out.print("Your birth date please: ");
            idCard[2] = scanner.nextLine();
        } while (idCard[2].length() < 8);

        System.out.printf("Hi my name is %s and my address is %s my date of birth is %s", idCard[0], idCard[1], idCard[2]);
    }
}
