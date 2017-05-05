package com.company.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class HR implements Observable {
    private List<Observer> observerList = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for(Observer observer:observerList){
            observer.message("we have new job");
        }
    }
}
