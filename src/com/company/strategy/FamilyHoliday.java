package com.company.strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class FamilyHoliday implements HolidayStrategy {
    @Override
    public void celebrate() {
        System.out.println("it's a family supper");
    }
}
