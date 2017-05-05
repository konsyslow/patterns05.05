package com.company.prototype.elements;

import com.company.prototype.Element;

/**
 * Created by admin on 03.05.2017.
 */
public class CityBlock extends Element {
    public CityBlock() {
    }

    public CityBlock(CityBlock target) {
        super(target);
    }

    @Override
    public Element clone() {
        return new CityBlock(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof CityBlock) || !super.equals(object2)) return false;
        else return true;
    }
}
