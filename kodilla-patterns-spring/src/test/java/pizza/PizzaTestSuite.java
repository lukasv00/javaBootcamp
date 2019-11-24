package pizza;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {

    @Test
    public void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredietns = pizza.getIngredients().size();
        //Then
        Assert.assertEquals(3,howManyIngredietns);
    }
}
