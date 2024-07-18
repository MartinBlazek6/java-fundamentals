package org.example.museum.panels;

import org.example.museum.Museum;
import org.example.museum.Order;
import org.example.museum.Ticket;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class AdminPanel {

    public static Ticket[] getTicketsByDate(Museum museum, LocalDate localDate) {
       return Arrays.stream(museum.getOrders()).map(Order::getTickets)
                .flatMap(Arrays::stream)
                .filter(ticket -> ticket.getDate().equals(localDate))
                .toArray(Ticket[]::new);
    }

    public static Ticket[] getTicketsByDateNonStream(Museum museum, LocalDate localDate) {
        int count = 0;

        for (Order order : museum.getOrders()) {
            for (Ticket ticket : order.getTickets()) {
                if (ticket.getDate().equals(localDate)) {
                    count++;
                }
            }
        }

        Ticket[] matchingTickets = new Ticket[count];
        int index = 0;

        for (Order order : museum.getOrders()) {
            for (Ticket ticket : order.getTickets()) {
                if (ticket.getDate().equals(localDate)) {
                    matchingTickets[index++] = ticket;
                }
            }
        }

        return matchingTickets;
    }

    public static void adminInterface(Museum museum) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date to search for tickets (YYYY-MM-DD): ");
        String dateString = scanner.nextLine();
        LocalDate targetDate = LocalDate.parse(dateString);

//        Ticket[] ticketsByDate = AdminPanel.getTicketsByDate(museum, targetDate);
        Ticket[] ticketsByDate = AdminPanel.getTicketsByDateNonStream(museum, targetDate);
        System.out.println("Tickets on " + targetDate + ": " + Arrays.toString(ticketsByDate));
        System.out.println("Number of tickets on " + targetDate + ": " + ticketsByDate.length);
    }
}
