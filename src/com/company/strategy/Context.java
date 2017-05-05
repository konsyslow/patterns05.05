package com.company.strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class Context {
    private HolidayStrategy strategy;
    private boolean hasFamily;
    private boolean hasFriends;
    private int cash;
    public void celebrate(){
        if(hasFamily){
            strategy = new FamilyHoliday();
        }else if(hasFriends && cash > 5000){
            strategy = new FriendsHoliday();
        }else {
            strategy = new ForeverAloneHoliday();
        }
        strategy.celebrate();
    }

    public void setHasFamily(boolean hasFamily) {
        this.hasFamily = hasFamily;
    }

    public void setHasFriends(boolean hasFriends) {
        this.hasFriends = hasFriends;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
