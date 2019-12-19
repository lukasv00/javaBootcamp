package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.dao.TaskListDao;
import com.kodilla.hibernate.tasks.Task;
import com.kodilla.hibernate.tasks.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "SAMPLE DESCRIPTION";
    private static final String LISTNAME = "SAMPLE LISTNAME";


   /* @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        String name = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        Assert.assertEquals(LISTNAME, readTaskList.get(id).getListName());

        //CleanUp
        taskListDao.deleteById(id);
    }*/

   @Test
    public void testTaskListDaoSaveWithTasks() {
       //Given
       Task task = new Task("Test: Learn Hibernate", 14);
       Task task2 = new Task("Test: write some entities", 3);
       TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(120), true);
       TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(80), false);
       task.setTaskFinancialDetails(tfd);
       task2.setTaskFinancialDetails(tfd2);
       TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
       taskList.getTasks().add(task);
       taskList.getTasks().add(task2);
       task.setTaskList(taskList);
       task2.setTaskList(taskList);

       //When
       taskListDao.save(taskList);
       int id = taskList.getId();

       //Then
       Assert.assertNotEquals(0, id);

       //CleanUp
        taskListDao.deleteById(id);
   }
}
