package org.example.museum.panels;

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
}
