package org.example.museum;

import org.example.museum.panels.UserPanel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Museum museum = new Museum();


        Ticket[] t1 = UserPanel.bookTickets(2);

        Order o = UserPanel.createOrder("Martin Blazek", t1);
        Order o1 = UserPanel.createOrder("Martin asd", t1);
        Order o2 = UserPanel.createOrder("Martin aa", t1);

        museum.setOrders(new Order[]{o, o1, o2});

        System.out.println(museum);



    }
}
