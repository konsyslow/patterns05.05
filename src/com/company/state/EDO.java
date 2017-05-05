package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public class EDO {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void toSend(){
        if(state instanceof NewState){
            System.out.println("you must sign document");
        }else if(state instanceof SignedState){
            System.out.println("you must register document");
        }else if(state instanceof RegisteredState){
            System.out.println(" send");
            state =
        }
    }



}
