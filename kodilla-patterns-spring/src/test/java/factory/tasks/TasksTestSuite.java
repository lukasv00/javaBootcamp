package factory.tasks;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TasksFactory;
import org.junit.Assert;
import org.junit.Test;

public class TasksTestSuite {

    @Test
    public void testDriving(){
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        //When
        Task drivingTask = tasksFactory.makeTask(TasksFactory.DRIVING);
        //Then
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("alko", drivingTask.getTaskName());
    }
    @Test
    public void testPainting(){
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        //When
        Task paintingTask = tasksFactory.makeTask(TasksFactory.PAINTING);
        //Then
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("comie", paintingTask.getTaskName());
    }
    @Test
    public void testShopping(){
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        //When
        Task shoppingTask = tasksFactory.makeTask(TasksFactory.SHOPPING);
        //Then
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("jajecznica", shoppingTask.getTaskName());
    }
}
