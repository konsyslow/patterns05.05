package com.company.prototype;

import com.company.prototype.elements.City;
import com.company.prototype.elements.House;
import com.company.prototype.elements.UrbanArea;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 03.05.2017.
 */
public class Client {
    public static void main(String[] args) {
        List<Element> elementList = new ArrayList<>();
        List<Element> elementList1Copy = new ArrayList<>();

        House house = new House();
        house.setCitizensNumber(10);
        elementList.add(house);

        House anotherHouse = (House) house.clone();
        elementList1Copy.add(anotherHouse);

        UrbanArea urbanArea = new UrbanArea();
        urbanArea.setCitizensNumber(20);
        urbanArea.setBudget(10000);
        elementList.add(urbanArea);

        UrbanArea anotherUrbanArea = (UrbanArea) urbanArea.clone();

        City city = new City();
        city.setCitizensNumber(1000);
        city.setBudget(100000);
        city.setSquare(20000);

        elementList.add(city);

        City anotherCity = (City) city.clone();




    }
}
