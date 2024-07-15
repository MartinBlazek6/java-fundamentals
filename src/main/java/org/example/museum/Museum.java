package org.example.museum;


import java.util.Arrays;


public class Museum {
    private Order[] orders;

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        Order[] updatedOrders = new Order[orders.length];
        for (int i = 0; i < orders.length; i++) {
            updatedOrders[i] = orders[i];
        }
        updatedOrders[updatedOrders.length-1] = order;
        setOrders(updatedOrders);
    }

    @Override
    public String toString() {
        return "Museum{" +
                "orders=" + Arrays.toString(orders) +
                '}';
    }
}
