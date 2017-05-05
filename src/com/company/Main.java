package com.company;

import com.company.Observer.HR;
import com.company.Observer.Worker;
import com.company.builder.Boss;
import com.company.builder.galastyan.DjamshutBuilder;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HR hr1 = new HR();
        Worker worker = new Worker(1);
        Worker worker1 = new Worker(2);

        hr1.registerObserver(worker);
        hr1.registerObserver(worker1);

        hr1.notifyAllObserver();

        /*DjamshutBuilder bilderDj = new DjamshutBuilder();
        Boss boss = new Boss(bilderDj);
        boss.build();*/
    }
}
