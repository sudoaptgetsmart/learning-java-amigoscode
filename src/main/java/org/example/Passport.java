package org.example;

import java.time.LocalDate;

public class Passport {
    String number;
    String country;
    LocalDate expiryDate;

    Passport(String number, String country, LocalDate expiryDate) {
        this.number = number;
        this.country = country;
        this.expiryDate = expiryDate;
    }

}
