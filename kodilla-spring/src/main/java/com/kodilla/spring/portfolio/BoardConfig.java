package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getTaskList1(), getTaskList2(), getTaskList3());
    }

    @Autowired
    @Qualifier("taskList1")
    @Bean(name = "taskList1")
    public TaskList getTaskList1() {
        return new TaskList();
    }

    @Bean(name = "taskList2")
    public TaskList getTaskList2() {
        return new TaskList();
    }

    @Bean(name = "taskList3")
    public TaskList getTaskList3() {
        return new TaskList();
    }
}
