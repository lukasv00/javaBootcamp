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
            List<String> mockUserNames = new List<String>() {
                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<String> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(String s) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends String> c) {
                    return false;
                }

                @Override
                public boolean addAll(int index, Collection<? extends String> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }

                @Override
                public String get(int index) {
                    return null;
                }

                @Override
                public String set(int index, String element) {
                    return null;
                }

                @Override
                public void add(int index, String element) {

                }

                @Override
                public String remove(int index) {
                    return null;
                }

                @Override
                public int indexOf(Object o) {
                    return 0;
                }

                @Override
                public int lastIndexOf(Object o) {
                    return 0;
                }

                @Override
                public ListIterator<String> listIterator() {
                    return null;
                }

                @Override
                public ListIterator<String> listIterator(int index) {
                    return null;
                }

                @Override
                public List<String> subList(int fromIndex, int toIndex) {
                    return null;
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
        Assert.assertEquals(0.0, avgCommentPerPost,0.00001);
        Assert.assertEquals(1.0, avgCommentPerUser,0.00001);
    }

}
