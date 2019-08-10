package com.kodilla.testing.forum.statistics;

import java.util.*;

public class ForumStats {
    Statistics statistics;
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double postsAveragePerUser;
    double commentsAveragePerUser;
    double commentsAveragePerPost;

    public ForumStats(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.usersQuantity = statistics.userNames().size();
        this.postsQuantity = statistics.postCount();
        this.commentsQuantity = statistics.commentsCount();
        if(usersQuantity == 0){
            System.out.println("0 users - stats cannot be shown");
        }else{
            this.postsAveragePerUser = this.postsQuantity / this.usersQuantity;
            this.commentsAveragePerUser = this.commentsQuantity / this.usersQuantity;
        }
        if(postsQuantity == 0){
            System.out.println("0 posts - stats cannot be shown");
        }else{
            this.commentsAveragePerPost = this.commentsQuantity / this.postsQuantity;
        }
    }

    public void showStatiscits(){
        System.out.println("Users Quantity "+usersQuantity);
        System.out.println("Posts Quantity "+postsQuantity);
        System.out.println("Comments Quantity "+commentsQuantity);
        System.out.println("AVG posts per user "+postsAveragePerUser);
        System.out.println("AVG comment per user "+commentsAveragePerUser);
        System.out.println("AVG comments per post "+commentsAveragePerPost);
    }

    public double getPostsAveragePerUser() {
        return postsAveragePerUser;
    }

    public double getCommentsAveragePerUser() {
        return commentsAveragePerUser;
    }

    public double getCommentsAveragePerPost() {
        return commentsAveragePerPost;
    }
}
