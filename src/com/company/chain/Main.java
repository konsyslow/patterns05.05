package com.company.chain;

/**
 * Created by admin on 05.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        BabkiRumors babkiRumors = new BabkiRumors();
        babkiRumors.setMessage("Strings are very popular in Innopolis");
        babkiRumors.setAlive(false);
        NewspaperRumors newspaperRumors = new NewspaperRumors();
        newspaperRumors.setBalance(11000);
        InternetRumors internetRumors = new InternetRumors();
        internetRumors.setConnect(false);
        babkiRumors.setRumor(newspaperRumors);
        newspaperRumors.setRumor(internetRumors);
        babkiRumors.obs();
    }
}
