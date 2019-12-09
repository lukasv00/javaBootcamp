package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "SAMPLE DESCRIPTION";
    private static final String LISTNAME = "SAMPLE LISTNAME";


    @Test
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


    }
}
