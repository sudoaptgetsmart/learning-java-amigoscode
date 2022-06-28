package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
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
        System.out.println("fullName2 = " + fullName2);

        // Packages & Import Statement
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("date = " + date);
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTime = " + localDateTime);

        // Arithmetic Operations
        int ten = 10;
        int two = 2;
        int addition = ten + two;
        System.out.println("addition = " + addition);
        // you don't need variables
        System.out.println(10 - 2 + 6);

        // Math Class
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(3.6, 10.11));
        System.out.println(Math.min(3.6, 10.11));
        System.out.println(Math.pow(5, 2));
        // we can use int to make the above a whole number
        System.out.println((int) Math.pow(5, 2));
        System.out.println(Math.sqrt(25));

        // Comparison Operators
        // all comparison operators will return a boolean
        int khalidAge = 18;
        int mariamAge = 20;
        boolean isKhalidOlderThanMariam = khalidAge > mariamAge;
        System.out.println("isKhalidOlderThanMariam = " + isKhalidOlderThanMariam);

        // Logical Operators
        boolean isOld = false;
        boolean isYoung = true;
        boolean isAmigoscodeMember = true;
        // with && all expressions must be true, or it will be false
        System.out.println(isOld && isYoung);
        // || (or)
        System.out.println((isOld || isYoung) && isAmigoscodeMember);

        // If Statements
        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("Hooray... I am an adult");
        } else if (age2 >= 16) {
            System.out.println("I am almost an adult");
        } else {
            System.out.println("I am not old enough...");
        }

        // Ternary Operator
        String message = age2 >= 18 ? "Hooray... I am an adult" : "I am not old enough...";
        System.out.println(message);

        // Switch Statements
        String gender = "MALE";
        if (gender.equals("FEMALE")) {

        } else if (gender.equals("MALE")) {

        } else if (gender.equals("PREFER_NOT_SAY")) {

        } else {

        }
        // this switch statements does the same as above
        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("I am a female");
                break; // not needed after Java 11
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("Prefer not say");
                break;
            default:
                System.out.println("Not answered");
        }

        // Working with Arrays
        int[] numbers1 = {5, 6, 0};
        // numbers 1 does the same as numbers
        int[] numbers = new int[3]; // third one defaults to 0
        numbers[0] = 5;
        numbers[1] = 6;
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("numbers1 = " + Arrays.toString(numbers1));
        String[] names = {"Ali", "Maria", "Bob", "Mike"};
        System.out.println("names = " + Arrays.toString(names));

        // Arrays & Indexes
        int five = numbers[0];
        System.out.println("five = " + five);
        int last = numbers[numbers.length - 1];
        System.out.println("last = " + last);

        // Loops
        int number = 0;
        number++;
        System.out.println("number = " + number);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("regular for loop = " + numbers[i]);
        }
        // enhanced for loop
        for (int j : numbers) {
            System.out.println("enhanced for loop = " + j);
        }
        // numbers.for creates below
        for (int i : numbers) {

        }

        // Break & Continue
        for (String s : names) {
            System.out.println("s = " + s);
            if (s.equals("Bob")) {
                break;
            }
            System.out.println("s break on Bob = " + s);
        }

        // While Loop
        int count = 0;
        while (count <= 10) {
            System.out.println("count = " + count);
            count++;
        }

        // Do While
        do {
            System.out.println("do while count = " + count);
            count++;
        }
        while (count <= 10);
    }

    // reference types
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
