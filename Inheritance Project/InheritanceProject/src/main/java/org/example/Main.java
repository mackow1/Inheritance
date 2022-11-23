package org.example;

import org.example.people.*;
import org.example.projects.Project;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Project newProject = new Project();
        Client tomaszNowak = new Client("Tomasz", "Nowak", "23.04.2000", "650873957",
                "tomasznowak12@gmail.com", "Good Company");
        Developer janKowalski = new Developer("Marian", "Kalinowski", "12.03.1995", "676384658",
                "mariankalinowski@gmail.com", 12345, Contract.FULL, false,
                Team.BACKEND, Seniority.JUNIOR, new ArrayList<>());
        TeamLeader krzysztofKochanowski = new TeamLeader("Krzysztof", "Kochanowski", "22.06.1990",
                "766838763", "krzysztofkochanowski@blabla.pl", 100000, Contract.B2B,
                false, Team.BACKEND, Seniority.SENIOR, janKowalski);

        krzysztofKochanowski.createATask(newProject, "work faster", Team.BACKEND, 8, krzysztofKochanowski, janKowalski, Status.WIP);
    }
}
