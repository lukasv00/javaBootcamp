package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.ForumStats;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;
import static org.mockito.Mockito.*;

import java.util.*;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics(){
        Statistics statisticsMock = mock(Statistics.class);
            List<String> mockUserNames = new ArrayList<String>() { //implementacja listy (bez override)
                @Override
                public boolean isEmpty() {
                    return false;
                }
                @Override
            public int size() {
                return 100;
            }
        };
        when(statisticsMock.userNames()).thenReturn(mockUserNames);

        int mockPostCount = 1000;
        when(statisticsMock.postCount()).thenReturn(mockPostCount);

        int mockCommentsCount = 100;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        ForumStats forumStats = new ForumStats(statisticsMock);

        forumStats.calculateAdvStatistics(statisticsMock);
        double avgPostPerUser = forumStats.getPostsAveragePerUser();
        double avgCommentPerUser = forumStats.getCommentsAveragePerUser();
        double avgCommentPerPost = forumStats.getCommentsAveragePerPost();

        Assert.assertEquals(10.0, avgPostPerUser,0.00001);
        Assert.assertEquals(0.0, avgCommentPerPost,0.00001); //sprawdzić
        Assert.assertEquals(1.0, avgCommentPerUser,0.00001);
    }

}
