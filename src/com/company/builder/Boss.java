package com.company.builder;

/**
 * Created by admin on 03.05.2017.
 */
public class Boss {
    private HouseBuilder houseBuilder;

    public Boss(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void build(){
        houseBuilder.createWalls();
        houseBuilder.createRoof();
        houseBuilder.fillBasement();
        System.out.println(houseBuilder.getResult());
    }
}
