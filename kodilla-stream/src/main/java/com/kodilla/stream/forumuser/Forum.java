package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();


    public Forum() {
        theForumUserList.add(new ForumUser(1, "MammuthMan", 'M', LocalDate.of(1999, 2, 13), 112));
        theForumUserList.add(new ForumUser(2, "LovelyBoy123", 'M', LocalDate.of(2001, 3, 2), 23));
        theForumUserList.add(new ForumUser(3, "Rabarbar", 'F', LocalDate.of(1998, 4, 22), 34));
        theForumUserList.add(new ForumUser(4, "Kler", 'F', LocalDate.of(2010, 12, 7), 1001));
        theForumUserList.add(new ForumUser(5, "Wingerbur", 'M', LocalDate.of(1998, 9, 25), 2));
        theForumUserList.add(new ForumUser(6, "Kliko", 'F', LocalDate.of(2008, 1, 27), 0));
    }

    public List<ForumUser> getList(){
        return new ArrayList<>(theForumUserList);
    }
}
