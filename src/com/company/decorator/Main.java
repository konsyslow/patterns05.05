package com.company.decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        MainTariff mainTariff = new MainTariff();
        SMSTariff smsTariff = new SMSTariff(mainTariff);
        RoumingTariff roumingTariff = new RoumingTariff(smsTariff);
        InternetTariff internetTariff = new InternetTariff(roumingTariff);
        internetTariff.processTariff();


    }
}
