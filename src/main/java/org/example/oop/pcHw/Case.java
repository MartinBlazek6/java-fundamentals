package org.example.oop.pcHw;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Case {
    private String material;
    private String color;
    private Ventilator fan;
    private MotherBoard motherBoard;
}
