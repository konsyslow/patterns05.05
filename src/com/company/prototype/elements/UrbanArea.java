package com.company.prototype.elements;

import com.company.prototype.Element;

/**
 * Created by admin on 03.05.2017.
 */
public class UrbanArea extends Element {
    private int budget;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public UrbanArea() {
    }

    public UrbanArea(UrbanArea target) {
        super(target);
        if (target != null) {
            this.budget = target.budget;
        }
    }

    @Override
    public Element clone() {
        return new UrbanArea(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof UrbanArea) || !super.equals(object2)) return false;
        UrbanArea element = (UrbanArea) object2;
        return element.budget == budget;
    }
}
