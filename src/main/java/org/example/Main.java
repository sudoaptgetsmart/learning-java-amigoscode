package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        byte theByte = -128;
        short theShort = 3208;
        int theInt = 93420920;
        long theLong = 2092089042L;
        float theFloat = 3.14F;
        double theDouble = 3.1415;
        boolean isAdult = true;
        char nameInitial = 'T';

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println("theLong = " + theLong);
        System.out.println("theFloat = " + theFloat);
        System.out.println("theDouble = " + theDouble);
        System.out.println("isAdult = " + isAdult);
        System.out.println("nameInitial = " + nameInitial);

        // Non primitive data types AKA reference types
        String name = new String("Amigoscode");
        char c = 'A';
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now);
        // "int" starts with a lowercase, so it's primitive
        int age = 20;

        //  more primitives
        int a = 10;
        int b = a;
        // b is a copy of a and will not change when a changes
        a = 100;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Person alex = new Person("Alex");
        Person mariam = alex;

        System.out.println("before changing alex: ");
        System.out.println("alex = " + alex.name);
        System.out.println("mariam = " + mariam.name);

        alex.name = "Alexander";

        System.out.println("after changing alex: ");
        System.out.println("alex = " + alex.name);
        System.out.println("mariam = " + mariam.name);

        // changing mariam will affect alex
        mariam.name = "Mariam";
        System.out.println("after changing mariam: ");
        System.out.println("alex = " + alex.name);
        System.out.println("mariam = " + mariam.name);
    }
        // reference types
        static class Person {
            String name;

            Person(String name) {
                this.name = name;
            }
        }



    }
