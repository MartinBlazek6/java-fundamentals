package org.example.oop.bank;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankAccount {
    private String name;
    private Double balance;



    public void sendMoney(Double amount, BankAccount... receivers) {
        if (receivers.length < 1){
            System.out.println("At least one receiver has to bee chosen");
        }
        for (BankAccount receiver : receivers) {
            if (getBalance() >= amount * receivers.length && amount > 0) {
                receiver.setBalance(receiver.getBalance() + amount);
                setBalance(getBalance() - amount);
            } else if (amount < 0) {
                System.out.println("Thief!");
            } else {
                System.out.println("Not enough money dude!");
            }
        }
    }
}
