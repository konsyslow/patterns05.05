package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class State {
    protected Document document;

    public State(Document document) {
        this.document = document;
    }

    public abstract void send();
    public abstract void sign();
    public abstract void register();
    public abstract void deliver();
    public abstract void withdraw();

}
