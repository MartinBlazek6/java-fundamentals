package org.example.museum.panels;

import org.example.museum.Museum;
import org.example.museum.Order;
import org.example.museum.Ticket;

import java.time.LocalDate;
import java.util.Arrays;

public class AdminPanel {

    public static Ticket[] getTicketsByDate(Museum museum, LocalDate localDate) {
       return Arrays.stream(museum.getOrders()).map(Order::getTickets)
                .flatMap(Arrays::stream)
                .filter(ticket -> ticket.getDate().equals(localDate))
                .toArray(Ticket[]::new);
    }
}
