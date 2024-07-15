package org.example.museum;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Ticket {
    private String type;
    private Double price;
    private LocalDate date;

    public Ticket(String type, LocalDate date) {
        this.type = type;
        this.price = setPrice(type);
        this.date = date;
    }

    private Double setPrice (String type) {
        switch (type) {
            case "child" -> {
                return 10d;
            }
            case "regular" -> {
                return 20d;
            }
            case "disabled" -> {
                return 15d;
            }
            default -> {
                return null;
            }
        }
    }
}
