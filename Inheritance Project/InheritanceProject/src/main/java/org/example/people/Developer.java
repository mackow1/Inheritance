package org.example.people;

import org.example.projects.Task;
import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {

    private Team team;
    private Seniority seniority;
    protected List<Task> developersTasks = new ArrayList<>();

    public Developer(String firstName, String lastName, String dateOfBirth, String phoneNumber, String email, int salary,
                     Contract typeOfContract, boolean onHolidays, Team team, Seniority seniority,
                     List<Task> developersTasks) {
        super();
        this.team = team;
        this.seniority = seniority;
        this.developersTasks = developersTasks;
    }

    public Developer() {

    }

    public Seniority getSeniority() {
        return this.seniority;
    }

    public void setSeniority(Seniority seniority) {
        this.seniority = seniority;
    }

    public List<Task> getDevelopersTasks() {
        return developersTasks;
    }
}
