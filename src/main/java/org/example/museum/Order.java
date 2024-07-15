package org.example.museum;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class Order {
    private String fullName;
    private Ticket[] tickets;
}
