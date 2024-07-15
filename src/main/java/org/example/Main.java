package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(originalArray));

        int newSize = 10;

        int[] newArray = new int[newSize];

//        for (int i = 0; i < originalArray.length; i++) {
//            newArray[i] = originalArray[i];
//        }

        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);

        System.out.println("New array: " + Arrays.toString(newArray));
    }
}