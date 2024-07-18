package org.example.museum;


import lombok.Getter;
import lombok.Setter;
import org.example.museum.panels.AdminPanel;
import org.example.museum.panels.UserPanel;

import java.util.Arrays;
import java.util.Scanner;


@Setter
@Getter
public class Museum {
    private Order[] orders;

    public void addOrder(final Order order) {
        if (order == null || order.getTickets() == null) {
            return;
        }
        Order[] updatedOrder;
        if (getOrders() == null) {
            updatedOrder = new Order[1];
            updatedOrder[0] = order;
        } else {
            updatedOrder = new Order[getOrders().length + 1];
            System.arraycopy(getOrders(), 0, updatedOrder, 0, getOrders().length);
            updatedOrder[orders.length] = order;
        }
       orders = updatedOrder;
    }

    @Override
    public String toString() {
        return "Museum{" +
                "orders=" + Arrays.toString(orders) +
                '}';
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        final String adminPassword = "pass";

        do {
            System.out.print("Which panel do you want to use? (user/admin/exit): ");
            choice = scanner.nextLine().trim().toLowerCase();

            switch (choice) {
                case "user" -> UserPanel.userInterface(this);
                case "admin" -> {
                    System.out.print("Enter admin password: ");
                    String password = scanner.nextLine().trim();
                    if (password.equals(adminPassword)) {
                        AdminPanel.adminInterface(this);
                    } else {
                        System.out.println("Incorrect password. Access denied.");
                    }
                }
                case "exit" -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please enter 'user', 'admin', or 'exit'.");
            }

        } while (!choice.equals("exit"));
    }
}
