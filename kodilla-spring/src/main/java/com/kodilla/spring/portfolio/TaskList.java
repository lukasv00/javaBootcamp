package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks = new ArrayList<>();

    public List<String> listPreparation(String task) {
        tasks.add(task);

        return tasks;
    }

}
