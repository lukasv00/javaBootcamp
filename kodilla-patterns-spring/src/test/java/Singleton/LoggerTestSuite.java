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
        SingletonEnum.INSTANCE.log("log2");
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
        //When
        String result = SingletonEnum.INSTANCE.getLastLog();
        //Then
        Assert.assertEquals("log2",result);
    }


}
