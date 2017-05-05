package com.company.bridges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class BasicSocialweb implements SocialWeb {

    private DB postgreDB = new PostgreDB();


    private List<String> friends = new ArrayList<>();
    {
        friends.add("Alexey");
        friends.add("Artem");
        friends.add("Nikolay");

    }

    private int money;
    private List<String> notifications = Arrays.asList("notification1",
                                                            "notification2",
                                                            "notification3");

    @Override
    public List<String> getFriends() {
        return postgreDB.getListOfFriends();
    }

    @Override
    public void pay(int value) {

        money+=postgreDB.getMoney() + value;
       // money+=value;
    }

    @Override
    public List<String> wall() {

        return postgreDB.getWall();
    }
}
