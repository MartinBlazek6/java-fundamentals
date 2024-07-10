package org.example;

import java.util.Arrays;

public class NumberCounting {

        public static void main(String[] args) {
            int[] numbers = Arrays
                    .stream(args)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        numbers = Arrays.stream("6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7".split(" ")).mapToInt(Integer::parseInt).toArray();


//            numbers = new int[]{5, 6, 9, 9, 8, 7, 5, 15};

            int max=0;
            for (int number:numbers){
                if (max<number){
                    max=number;
                }
            }

//            for (int i = 0; i < numbers.length; i++) {
//                if (max<numbers[i]){
//                    max=numbers[i];
//                }
//            }


            int[] occurrences = new int[max];

            for (int hocico : numbers) {
                occurrences[hocico - 1] += 1;
            }

//        for (int i = 0; i < numbers.length; i++) {
//            occurrences[numbers[i] - 1] += 1;
//        }

            for (int i = 0; i < occurrences.length; i++) {
                System.out.println(i + 1 + " - " + occurrences[i]);
            }
        }
}
