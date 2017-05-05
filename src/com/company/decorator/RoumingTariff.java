package com.company.decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class RoumingTariff extends TariffDecorator {
    public RoumingTariff(CountTariffInterface countTariffInterface) {
        super(countTariffInterface);
    }

    @Override
    public void processTariff() {
        System.out.println("you have 10 days in rouming");
        super.processTariff();
    }
}
