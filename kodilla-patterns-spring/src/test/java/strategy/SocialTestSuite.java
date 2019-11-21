package strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class SocialTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User anna = new Millenials("Anna");
        User jan = new YGeneration("Jan");
        User mark = new ZGeneration("Mark");

        //When
        String annaSharingMethod = anna.sharePost();
        String janSharingMethod = jan.sharePost();
        String markSharingMethod = mark.sharePost();

        //Then
        Assert.assertEquals("Shared with Snapchat", annaSharingMethod);
        Assert.assertEquals("Shared with Facebook", markSharingMethod);
        Assert.assertEquals("Shared with Twitter", janSharingMethod);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User darek = new Millenials("Dar");
        //When
        String darekIndividualist = darek.sharePost();
        System.out.println(darekIndividualist);
        darek.sharingMethod(new FacebookPublisher());
        darekIndividualist = darek.sharePost();
        System.out.println(darekIndividualist);
        //Then
        Assert.assertEquals("Shared with Facebook",darekIndividualist);

    }
}
