package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("taskList3")
    TaskList taskList1;
    TaskList taskList2;
    TaskList taskList3;


    @Bean(name = "board")
    public Board getBoard(){
        return new Board(taskList1,taskList2,taskList3);
    }

    @Bean(name = "taskList1")
    public TaskList getTaskList1(){
        return new TaskList();
    }

    @Bean(name = "taskList2")
    public TaskList getTaskList2(){
        return new TaskList();
    }

    @Bean(name = "taskList3")
    public TaskList getTaskList3(){
        return new TaskList();
    }

    @Bean
    public void getListOfTasks(){
        taskList1.listPreparation("task1");
        taskList2.listPreparation("task2");
        taskList3.listPreparation("task3");
    }
}
