package com.raulmvp.utils;

import com.raulmvp.model.Game;
import com.raulmvp.model.Team;

import java.util.ArrayList;
import java.util.List;

public abstract class CollectionUtils {

    public static List<Team> generateListFromArray(Team[] array) {

        List<Team> teamList = new ArrayList<>();

        for(Team arrayElement : array) {
            teamList.add(arrayElement);
        }

        return teamList;
    }

    public static <T> List<T> randomizeList(List<T> list) {

        List<T> randomList = new ArrayList<>();
        int numberOfElements = list.size();

        while(list.size() > 0) {

            int index = (int) Math.abs(Math.random() * numberOfElements);
            randomList.add(list.remove(index));
            numberOfElements--;
        }

        return randomList;
    }

}
