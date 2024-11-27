package org.example;

public class ReviewQuestions {
    public static void main(String[] args) {
        // Question 1: Which of the following operators can be used with boolean variables?
        // ==, +, --, !, %, ~, Cast with (boolean)
        // Uncomment the souts below to see which work

        boolean a = true;
        boolean b = false;
//        System.out.println(a == b);
//        System.out.println(a + b);
//        System.out.println(a--);
//        System.out.println(!a);
//        System.out.println(a%b);
//        System.out.println(~a);
//        System.out.println((boolean) a);

        int pig = (short)4;
        pig = pig++;
        long goat = (int)2;
        goat -= 1.0;
        System.out.println(pig + " - " + goat);

        System.out.println(~8);
    }
}
