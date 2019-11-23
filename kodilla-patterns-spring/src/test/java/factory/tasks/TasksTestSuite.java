package factory.tasks;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TasksFactory;
import org.junit.Assert;
import org.junit.Test;

public class TasksTestSuite {

    @Test
    public void testIsDrivingTaskExecuted(){
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        //When
        Task drivingTask = tasksFactory.makeTask(TasksFactory.DRIVING);
        //Then
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
}
