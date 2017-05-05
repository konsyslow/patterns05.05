package com.company.prototype.elements;

import com.company.prototype.Element;

/**
 * Created by admin on 03.05.2017.
 */
public class House extends Element {
    public House() {
    }

    public House(House target) {
        super(target);
    }

    @Override
    public Element clone() {
        return new House(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof House) || !super.equals(object2)) return false;
        else return true;
    }
}
