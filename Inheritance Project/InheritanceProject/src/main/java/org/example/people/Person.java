package org.example.people;

abstract class Person {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phoneNumber;
    private String email;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }
}
