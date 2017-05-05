package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public class NewState extends State{

    public NewState(Document document) {
        super(document);

    }

    @Override
    public void send() {
        document.setState(new SendState(document));
        System.out.println("at first sign and register");
    }

    @Override
    public void sign() {

        document.setState(new SignedState(document));
        System.out.println("at fisrt register");

    }

    @Override
    public void register() {

        document.setState(new RegisteredState(document));
        System.out.println("lets send");
    }

    @Override
    public void deliver() {

    }

    @Override
    public void withdraw() {

    }
}
