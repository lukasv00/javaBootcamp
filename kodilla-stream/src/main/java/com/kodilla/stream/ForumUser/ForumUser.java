package com.kodilla.stream.ForumUser;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ForumUser {
    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsQty;

    public ForumUser(int id, String name, char sex, int year, int month, int day, int postsQty) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = LocalDate.of(year, month, day);
        this.postsQty = postsQty;
        if (postsQty < 0) {
            System.out.println("Negative quantity impossible");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return LocalDate.from(birthDate);
    }

    public int getPostsQty() {
        return postsQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id " + id +
                ", name '" + name + '\'' +
                ", sex " + sex +
                ", birthDate " + birthDate +
                ", postsQty " + postsQty +
                '}';
    }
}
