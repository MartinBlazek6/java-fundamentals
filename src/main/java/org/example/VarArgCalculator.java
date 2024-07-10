package org.example;

public class VarArgCalculator {
    public static void main(String[] args) {
        System.out.println("Add: " + add());
        System.out.println("Add: " + add(1, 2, 3, 4));
        System.out.println("Substract: " + subtract(2, 3, 4));
        System.out.println("Multiply: " + multiply(2, 3, 4));
        System.out.println("Multiply: " + multiply(2, 3, 4, -1));
        System.out.println("Divide: " + divide(20, 2, 2));
        System.out.println("Divide: " + divide(20, 2, 2, 0));
    }

     static double add(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

     static double subtract(double... numbers) {
        if (numbers.length < 1){
            return 0;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

     static double multiply(double... numbers) {
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }

     static double divide(double... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result /= numbers[i];
        }
        return result;
    }
}
