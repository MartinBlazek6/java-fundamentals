package org.example.museum.panels;

import org.example.museum.Museum;
import org.example.museum.Order;
import org.example.museum.Ticket;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class UserPanel {
    public static Order createOrder (final String fullName, final Ticket[] tickets) {
        return Order.builder()
                .fullName(fullName)
                .tickets(tickets).build();
    }

    private static Ticket bookTicket(final String dateInStringFormat, final String type) {
        return new Ticket(type,parseStringToLocalDate(dateInStringFormat));
    }

    public static Ticket[] bookTickets (int count) {
        Ticket[] tickets = new Ticket[count];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.print("what date?");
            String date = scanner.nextLine();

            System.out.print("what type?");
            String type = scanner.nextLine();

            tickets[i] = bookTicket(date,type);
        }
        return tickets;
    }


    public static LocalDate parseStringToLocalDate(final String dateString) {
        final String pattern = "yyyy-MM-dd";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            return LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
            return null;
        }
    }

    public static void userInterface(Museum museum) {
        Scanner scanner = new Scanner(System.in);
        String userResponse;

        do {
            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();

            int numberOfTickets;
            do {
                System.out.print("How many tickets do you want to book? (1-3): ");
                numberOfTickets = scanner.nextInt();
                scanner.nextLine();
            } while (numberOfTickets < 1 || numberOfTickets > 3);

            Ticket[] tickets = UserPanel.bookTickets(numberOfTickets);

            Order order = UserPanel.createOrder(userName, tickets);

            museum.addOrder(order);

            System.out.print("Do you want to place another order? (yes/no): ");
            userResponse = scanner.nextLine();

        } while (userResponse.equalsIgnoreCase("yes"));
    }
}
