package com.company.prototype;

/**
 * Created by admin on 03.05.2017.
 */
public abstract class Element {
    private int citizensNumber;

    public int getCitizensNumber() {
        return citizensNumber;
    }

    public void setCitizensNumber(int citizensNumber) {
        this.citizensNumber = citizensNumber;
    }

    public Element(){

    }

    public Element(Element target) {
        if (target != null) {
            this.citizensNumber = target.citizensNumber;
        }

    }

    public abstract Element clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Element)) return false;
        Element element = (Element) object2;
        return element.citizensNumber == citizensNumber;
    }


}
