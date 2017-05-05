package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public class Document {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
