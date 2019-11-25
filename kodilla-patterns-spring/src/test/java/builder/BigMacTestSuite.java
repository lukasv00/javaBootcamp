package builder;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testBigMac() {
        //Given
        Bigmac mac = new Bigmac.BigMacBuilder()
                .ingredient("Onion")
                .ingredient("jalapeno")
                .burgers(2)
                .bun("no sesame")
                .sauce("1000 islands")
                .build();
        System.out.println(mac);
        //When
        int howManyIngredietns = mac.getIngredients().size();
        String whatSauce= mac.getSauce();
        //Then
        Assert.assertEquals(2,howManyIngredietns);
        Assert.assertEquals("1000 islands",whatSauce);
    }
}
