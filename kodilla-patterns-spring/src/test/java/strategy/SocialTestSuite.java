package strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class SocialTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User anna = new Millenials("Anna", new SnapchatPublisher());
        User jan = new YGeneration("Jan", new TwitterPublisher());
        User mark = new ZGeneration("Mark", new FacebookPublisher());

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
        User darek = new Millenials("Dar", new SnapchatPublisher());
        //When
        String darekIndividualist = darek.sharePost();
        System.out.println(darekIndividualist);
        String darekIndividualistWithOwnMethod = darek.sharingMethod(new FacebookPublisher());
        System.out.println(darekIndividualistWithOwnMethod);
        //Then
        Assert.assertEquals("Shared with Facebook",darekIndividualistWithOwnMethod);

    }
}
