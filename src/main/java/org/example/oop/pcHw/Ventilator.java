package org.example.oop.pcHw;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Ventilator {
    private Integer rpm;
    private Double size;
    private Double power;
    private boolean isLed;
}
