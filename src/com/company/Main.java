package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Ann";
        int age = 28;
        int temperature = 22;
        if (age > 20 && age < 45 && temperature < 30 && temperature > -20) {
            System.out.println("You can go out");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("You can go out");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println("You can go out");
        }

    }
}
