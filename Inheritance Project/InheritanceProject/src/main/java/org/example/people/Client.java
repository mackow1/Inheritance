package org.example.people;

import java.time.LocalDate;

public class Client extends Person {

    private String companyName;

    public Client(String firstName, String lastName, String dateOfBirth, String phoneNumber, String email, String companyName) {
        super();
        this.companyName = companyName;
    }
}
