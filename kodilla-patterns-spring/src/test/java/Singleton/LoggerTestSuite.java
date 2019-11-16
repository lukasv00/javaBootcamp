package Singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logIn(){
        Logger.getInstance().log("log1");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log1",result);
    }


}
