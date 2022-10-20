package org.example;

import javax.swing.*;

public class ForkliftDriver extends Personel {

    private String forkliftModel;

    public ForkliftDriver(String firstName, String lastName, String position, int salary, boolean hasValidMedicalChecks, int experience, String forkliftModel) {
        super(firstName, lastName, position, salary, hasValidMedicalChecks, experience);
        this.forkliftModel = forkliftModel;
    }

    public void goToMedicalChecks() {
        System.out.println("Checking...");
    }

    public void checkEfficiency(int number) {
        if (number > 1) super.giveRaise(100);
    }
}

