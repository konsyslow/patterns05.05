package com.company.chain;

/**
 * Created by admin on 05.05.2017.
 */
public class BabkiRumors extends Rumor {
    private boolean isAlive = true;

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public void obs() {

        if(!isAlive){
            System.out.println("Sorry, Babka is dead");
            return;
        }
        System.out.println("babka said ");
        super.obs();
    }
}
