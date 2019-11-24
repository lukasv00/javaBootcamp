package Singleton;

import com.kodilla.patterns.singleton.Logger;
import com.kodilla.patterns.singleton.SingletonEnum;
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

    @Test
    public void testSingletonEnum(){
        //Given
        SingletonEnum.INSTANCE.log("log2");
        //When
        String lastLog = SingletonEnum.INSTANCE.getLastLog();
        //Then
        Assert.assertEquals("log2",lastLog);
    }


}
