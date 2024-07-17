package org.example.museum;

import org.example.museum.panels.AdminPanel;
import org.example.museum.panels.UserPanel;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Museum museum = new Museum();


        Ticket[] t1 = UserPanel.bookTickets(1);
        Ticket[] tx = {
                new Ticket("regular", LocalDate.parse("2020-02-02")),
                new Ticket("regular", LocalDate.parse("2020-02-02")),
                new Ticket("child", LocalDate.parse("2020-02-02"))
        };


        Order o = UserPanel.createOrder("Martin Blazek", t1);
        Order o1 = UserPanel.createOrder("Martin asd", t1);
        Order o2 = UserPanel.createOrder("Martin aa", tx);

        museum.setOrders(new Order[]{o, o1, o2});

        System.out.println(museum);


        System.out.println(Arrays.toString(AdminPanel.getTicketsByDate(museum, LocalDate.parse("2020-02-02"))));
        System.out.println(AdminPanel.getTicketsByDate(museum,LocalDate.parse("2020-02-02")).length);


    }
}
