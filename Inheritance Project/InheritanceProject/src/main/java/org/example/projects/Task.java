package org.example.projects;

import org.example.people.Status;
import org.example.people.Team;

public class Task extends Project {
    private String description;
    private Team team;
    private int timeToFinish;
    private String leadName;
    private String devName;
    private Status status;

    public Task(String description, Team team, int timeToFinish, String leadName, String devName, Status status) {
        this.description = description;
        this.team = team;
        this.timeToFinish = timeToFinish;
        this.leadName = leadName;
        this.devName = devName;
        this.status = status;
    }

    public Task() {

    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getTimeToFinish() {
        return this.timeToFinish;
    }

    public void setTimeToFinish(int timeToFinish) {
        this.timeToFinish = timeToFinish;
    }

    public String getLeadName() {
        return this.leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public String getDevName() {
        return this.devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
