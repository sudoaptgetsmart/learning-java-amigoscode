package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

        // Non-primitive data types AKA reference types
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

        // Naming variables (should make sense)
        int zero = 0;
        int one = 1;
        double pi = 3.1415;
        // an underscore (_) makes it easier to read but will print normal in console
        int subscriberCount = 1_000_000;

        // The String Class
        // String is the class
            // myName is the object
        String myName = new String("Taylor");
        // with Strings, you don't need "new String()"
            // below will do the same thing
        String myNameWithoutNew = ("Samuel");
        System.out.println("myName = " + myName);
        System.out.println("myName contains lor = " + myName.contains("lor"));
        String sam = "Sam";
        System.out.println("myNameWithoutNew = " + myNameWithoutNew);
        // eslint will alert that below will always equal true and suggest simplifying
        System.out.println("myNameWithoutNew contains sam = " + myNameWithoutNew.contains(sam));
        System.out.println("myNameWithoutNew equals sam = " + myNameWithoutNew.equals(sam));
        // simplified version below
        System.out.println("myNameWithoutNew equals sam simplified = " + false);

        //Concatenating Strings
        String firstName = "Alex";
        String lastName = "Jamir";
        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);
        // this does the same thing
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("fillName2 = " + fullName2);

        // Packages & Import Statement
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("date = " + date);
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTime = " + localDateTime);


    }

    // reference types
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
