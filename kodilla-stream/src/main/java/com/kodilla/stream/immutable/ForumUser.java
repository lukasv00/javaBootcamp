package com.kodilla.stream.immutable;

import java.util.Date;
import java.util.List;

public final class ForumUser {
    private final String username;
    private final String realName;
    private final Date birthdate;
    private final List<ForumUser> friends;

    public ForumUser(final String username, final String realName, final int year, final int month, final int day, final List<ForumUser> friends) {
        this.username = username;
        this.realName = realName;
        this.friends = friends;
        this.birthdate = new Date(year,month,day);
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public List<ForumUser> getFriends() {
        return friends;
    }

    public List<ForumUser> addFriend(ForumUser forumUser){
        friends.add(forumUser);
        return friends;
    }

}
