package com.kodilla.stream.ForumUser;

import java.util.*;

public class Forum {
    private List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum() {
        listOfForumUsers.add(new ForumUser(0, "Ada", 'F', 1992, 4, 10, 15));
        listOfForumUsers.add(new ForumUser(1, "Matt", 'M', 2000, 3, 15, 112));
        listOfForumUsers.add(new ForumUser(2, "Luc", 'M', 1999, 1, 20, 3));
        listOfForumUsers.add(new ForumUser(3, "Ellie", 'F', 1920, 8, 19, 1233));
        listOfForumUsers.add(new ForumUser(4, "Al", 'M', 1998, 6, 16, 0));
        listOfForumUsers.add(new ForumUser(5, "Max", 'M', 1992, 6, 21, 133));
        listOfForumUsers.add(new ForumUser(6, "Philippe", 'M', 1999, 3, 30, 3));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<ForumUser>(listOfForumUsers);
    }
}
