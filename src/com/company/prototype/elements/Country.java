package com.company.prototype.elements;

import com.company.prototype.Element;

/**
 * Created by admin on 03.05.2017.
 */
public class Country extends Element {
    private int budget;
    private int square;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public Country() {
    }

    public Country(Country target) {
        super(target);
        if (target != null) {
            this.budget = target.budget;
            this.square = target.square;
        }
    }

    @Override
    public Element clone() {
        return new Country(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Country) || !super.equals(object2)) return false;
        Country element = (Country) object2;
        return element.budget == budget && element.square == square;
    }
}
