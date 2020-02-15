package builder;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import com.kodilla.patterns.builder.bigmac.bigMacEnums.Bun;
import com.kodilla.patterns.builder.bigmac.bigMacEnums.Meat;
import com.kodilla.patterns.builder.bigmac.bigMacEnums.Sauce;
import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testBigMac() {
        //Given
        Bigmac mac = new Bigmac.BigMacBuilder()
                .meat(Meat.BEEF)
                .ingredient("Onion")
                .ingredient("jalapeno")
                .burgers(2)
                .bun(Bun.GRAINS)
                .sauce(Sauce.ISLANDS)
                .build();
        System.out.println(mac);
        //When
        int howManyIngredietns = mac.getIngredients().size();
        Sauce whatSauce= mac.getSauce();
        Meat whatMeat= mac.getMeat();
        //Then
        Assert.assertEquals(2,howManyIngredietns);
        Assert.assertEquals(Sauce.ISLANDS,whatSauce);
        Assert.assertEquals(Meat.BEEF,whatMeat);
    }
}
