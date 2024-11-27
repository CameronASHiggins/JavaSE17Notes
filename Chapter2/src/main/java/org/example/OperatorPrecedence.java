package org.example;

public class OperatorPrecedence {
    public static void main(String[]args){
        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.print("Zoo animal recieves: "+reward+" reward points");
    }
}
