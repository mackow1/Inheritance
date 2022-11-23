package org.example.people;

import org.example.projects.Project;
import org.example.projects.Task;

public class TeamLeader extends Developer {

    private Developer ward;

    public TeamLeader(String firstName, String lastName, String dateOfBirth, String phoneNumber, String email, int salary,
                      Contract typeOfContract, boolean onHolidays, Team backOrFront, Seniority seniority, Developer ward) {
        super();
        this.ward = ward;
    }

    public TeamLeader() {

    }

    public Developer getWard() {
        return this.ward;
    }

    public void setWard(Developer ward) {
        this.ward = ward;
    }

    public void createATask(Project name, String description, Team team, int timeToFinish, TeamLeader leadName, Developer devName, Status status) {
        Task taskName = new Task(description, team, timeToFinish, leadName.getFirstName(), devName.getFirstName(), status);
        name.addNewTask(taskName);
    }

    public void addDevelopersTask(Developer ward, Task name) {
        ward.developersTasks.add(name);
    }

    public void takeDevelopersTask(Developer ward, Task name) {
        ward.developersTasks.remove(name);
    }
}
