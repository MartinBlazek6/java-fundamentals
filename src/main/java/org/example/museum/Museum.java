package org.example.museum;


import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;


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
}
