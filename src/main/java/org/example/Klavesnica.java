package org.example;


import java.util.Scanner;

public class Klavesnica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Prosim napis tvoje meno: ");
        name = scanner.nextLine();

        System.out.print("Fajn a teraz napis tvoje vek: ");
        age = scanner.nextInt();

        System.out.printf("Okej, tvoje meno je: %s \n", name);
        System.out.printf("A mas akurat: %d rokov \n", age);

        scanner.close();



    }
}
