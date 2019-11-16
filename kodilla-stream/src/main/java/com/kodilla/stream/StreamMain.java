package com.kodilla.stream;


import com.kodilla.stream.ForumUser.Forum;
import com.kodilla.stream.ForumUser.ForumUser;

import java.util.Map;
import java.util.stream.*;

public class StreamMain {
    public static void main(String[] args) {
        Forum forumData = new Forum();
        Map<Integer, ForumUser> mapOfUsers = forumData.getUsersList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().getYear() <= 1999)
                .filter(user -> user.getPostsQty() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        mapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}
