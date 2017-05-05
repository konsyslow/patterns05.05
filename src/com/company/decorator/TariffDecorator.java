package com.company.decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class TariffDecorator implements CountTariffInterface{
    private CountTariffInterface countTariffInterface;

    @Override
    public void processTariff() {
        countTariffInterface.processTariff();
    }

    public TariffDecorator(CountTariffInterface countTariffInterface) {
        this.countTariffInterface = countTariffInterface;
    }
}
