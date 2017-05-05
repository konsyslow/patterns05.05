package com.company.builder.galastyan;

import com.company.builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class RavshanBuilder implements HouseBuilder {
    private String basement;
    private String walls;
    private String roof;

    public String getResult(){
        return basement + " " + walls+" "+roof;
    }

    @Override
    public void fillBasement() {
        basement = " Ravshan create all";
    }

    @Override
    public void createWalls() {
        walls=" lblack";
    }

    @Override
    public void createRoof() {
        roof = "line1";
    }
}
