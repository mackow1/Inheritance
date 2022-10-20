package org.example;

public class Manager extends Personel {

    private String eduDegree;

    public Manager(String firstName, String lastName, String position, int salary, boolean hasValidMedicalChecks, int experience, String eduDegree) {
        super(firstName, lastName, position, salary, hasValidMedicalChecks, experience);
        this.eduDegree = eduDegree;
    }
}
