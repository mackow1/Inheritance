package org.example.projects;

import org.example.people.Client;
import org.example.people.Developer;
import org.example.people.TeamLeader;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate deadLine;
    private String technologies;
    private Client client;
    private List<Task> listOfTasks = new ArrayList<>();
    private List<Developer> devList = new ArrayList<>();
    private TeamLeader teamLeader;

    public Project(String name, String description, LocalDate startDate, LocalDate deadLine, String technologies,
                   Client client, List<Task> listOfTasks, List<Developer> devList, TeamLeader teamLeader) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.deadLine = deadLine;
        this.technologies = technologies;
        this.client = client;
        this.listOfTasks = listOfTasks;
        this.devList = devList;
        this.teamLeader = teamLeader;
    }

    public Project() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getDeadLine() {
        return deadLine;
    }
    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }
    public String getTechnologies() {
        return technologies;
    }
    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public List<Task> getListOfTasks() {
        return listOfTasks;
    }
    public void addNewTask(Task newTask) {
        listOfTasks.add(newTask);
    }
    public List<Developer> getDevList() {
        return this.devList;
    }
    public void addNewDeveloper(Developer developer) {
        this.devList.add(developer);
    }
    public TeamLeader getTeamLeader() {
        return this.teamLeader;
    }

    public void setTeamLeader(TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
    }
}
