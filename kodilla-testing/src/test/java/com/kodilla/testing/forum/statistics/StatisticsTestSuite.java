package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.ForumStats;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import static org.mockito.Mockito.*;

import java.util.*;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("Andy");
        userNames.add("Mark");
        userNames.add("Linda");
        userNames.add("Marco");
        when(statisticsMock.userNames()).thenReturn(userNames);

        int mockPostCount = 1000;
        when(statisticsMock.postCount()).thenReturn(mockPostCount);

        int mockCommentsCount = 10;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        ForumStats forumStats = new ForumStats(statisticsMock);

        forumStats.calculateAdvStatistics(statisticsMock);
        double avgPostPerUser = forumStats.getPostsAveragePerUser();
        double avgCommentPerUser = forumStats.getCommentsAveragePerUser();
        double avgCommentPerPost = forumStats.getCommentsAveragePerPost();

        Assert.assertEquals(250, avgPostPerUser, 0.00001);
        Assert.assertEquals(0, avgCommentPerPost, 0.00001);
        Assert.assertEquals(2, avgCommentPerUser, 0.00001);
    }

}
