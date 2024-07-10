package org.example;

public class Tasks {

    static int[] numbers = {12, 55, 88, 66, 223};


    public static void main(String[] args) {

//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                System.out.println(number);
//            }
//
//        }


        String[] names = {"Tom", "majka", "Xi", "Tono    ", "", "Maximilian", new String("Ferdinand IX"), "Chloe \n", "Divne".concat("meno \n")};


        //1 napisat vsetko
        //2 viac ako 5 pismen
        //3 velke zaciatocne pismeno
        //4 samohlasky -- najviac casu
        //5 medzery --najrychlejsie



        for (String name : names) {
            name = name.trim();
            if (name.length() > 5 && Character.isUpperCase(name.charAt(0))) {
                boolean hasVowel = false;
                for (char ch : name.toCharArray()) {
                    if ("AEIOUaeiou".indexOf(ch) != -1) {
                        hasVowel = true;
                        break;
                    }
                }
                if (hasVowel) {
                    System.out.println(name);
                }
            }
        }











        for (String name : names) {
            name = name.trim();
            if (name.length() > 5 && Character.isUpperCase(name.charAt(0)) && name.matches(".*[AEIOUaeiou].*")) {
                System.out.println(name);
            }
        }
    }

    private static boolean containsVowel(String str) {
        String vowels = "AEIOUaeiou";
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                return true;
            }
        }
        return false;
    }

    //        int[] numbers = {12, 55, 88, 66, 223};
    int index = 0;




}
