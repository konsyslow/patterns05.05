package com.company.decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class SMSTariff extends TariffDecorator {
    public SMSTariff(CountTariffInterface countTariffInterface) {
        super(countTariffInterface);
    }

    @Override
    public void processTariff() {
        System.out.println("you have 100 sms");
        super.processTariff();
    }
}
