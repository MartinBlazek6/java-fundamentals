package org.example.oop.bank;

import java.time.LocalDate;

public class Bank {
    static BankAccount bankAccount1;
    static BankAccount bankAccount2;
    static BankAccount bankAccount3;
    static BankAccount builderBankAccount;

    static MyPrinter myPrinter = new MyPrinter();

    public static void main(String[] args) {
        bankAccount1 = new BankAccount("Petr Neznamy", 2000d);
        bankAccount2 = new BankAccount("Petr Znamy", 2000d);
        bankAccount3 = new BankAccount("Petr Neznamy", 2000d);

        builderBankAccount = BankAccount.builder().build();


//
//        getStatus();
//
//        bankAccount1.sendMoney(100d,bankAccount2);
//        bankAccount1.sendMoney(100d,bankAccount2, bankAccount3);
//
//        getStatus();

        System.out.println(bankAccount1.equals(bankAccount2));
        System.out.println(bankAccount1.equals(bankAccount3));

    }


    public static void getStatus() {
        System.out.printf("%s ma na ucte %s $ \n", bankAccount1.getName(), bankAccount1.getBalance());
        System.out.printf("%s ma na ucte %s $ \n", bankAccount2.getName(), bankAccount2.getBalance());
        System.out.printf("%s ma na ucte %s $ \n", bankAccount3.getName(), bankAccount3.getBalance());
        System.out.println();
    }
}
