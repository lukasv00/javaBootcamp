package factory;

import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTestSuite {

    @Test
    public void testFactoryCircle(){
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //Then
        Assert.assertEquals(Math.PI * Math.pow(4.5,2.0), circle.getArea(),0);
        Assert.assertEquals("rounded circle", circle.getName());
    }

    @Test
    public void testFactorySquare(){
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape square = factory.makeShape(ShapeFactory.SQUARE);
        //Then
        Assert.assertEquals(28.0, square.getCircumference(),0);
        Assert.assertEquals("angular square", square.getName());
    }

    @Test
    public void testFactoryRectangle(){
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        Assert.assertEquals(37.5, rectangle.getArea(),0);
        Assert.assertEquals("long rectangle", rectangle.getName());
    }

}
