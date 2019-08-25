package com.kodilla.stream.immutable;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public final class ForumUser {
    private final String username;
    private final String realName;
    private final Date birthdate;
    private final List<ForumUser> friends = new LinkedList<>();

    public ForumUser(final String username, final String realName, final int year, final int month, final int day) {
        this.username = username;
        this.realName = realName;
        this.birthdate = new Date(year,month,day);
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public Date getBirthdate() {
        Date returningBirthdate = birthdate;
        return returningBirthdate;
    }

    public List<ForumUser> getFriends() {
        return new LinkedList<ForumUser>(friends);
    }

    public void addFriend(ForumUser forumUser){
        friends.add(forumUser);
    }

}
