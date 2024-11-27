package org.example;

public class ApplyingUnaryOperators {
    public static void main(String[] args) {

        int a, b, c;
        a = b = c = 5;

        System.out.println("The output of !false is: " + !false);

        System.out.println("The output of ~4 is: " + ~4);
        System.out.println("The output of ~-5 is: " + ~-5);

        System.out.println("The output of +5 is: " + +5);
        System.out.println("The output of -5 is: " + -5);

        System.out.println("The output of ++a is: " + ++a);
        System.out.println("The output of a++ is: " + a++);
        System.out.println("but then output a again and you get: " + a);

        System.out.println("The output of --b is: " + --b);
        System.out.println("The output of b-- is: " + b--);
        System.out.println("but then output b again and you get: " + b);

        System.out.println("The output of (float)c is: " + (float)c);
    }
}
