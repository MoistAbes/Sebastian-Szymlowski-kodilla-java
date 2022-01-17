package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private int userCount;
    private int postsCount;
    private int commentsCount;

    private Double averagePostsPerUser;
    private Double averageCommentsPerUser;
    private Double averageCommentsPerPost;



    public void calculateAdvStatistics(Statistics statistics){

        userCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();

        if (postsCount == 0)
            commentsCount = statistics.commentsCount() - statistics.commentsCount();
        else
            commentsCount = statistics.commentsCount();



        if (postsCount == 0 || userCount == 0)
            averagePostsPerUser = 0.0;
        else
            averagePostsPerUser = ((double) postsCount /(double) userCount);

        if (commentsCount == 0 || userCount == 0)
            averageCommentsPerUser = 0.0;
        else
            averageCommentsPerUser =  ((double)commentsCount / (double)userCount);

        if (postsCount == 0 || commentsCount == 0)
            averageCommentsPerPost = 0.0;
        else
            averageCommentsPerPost =  ((double)commentsCount / (double)postsCount);


    }

    public Double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public Double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public Double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
