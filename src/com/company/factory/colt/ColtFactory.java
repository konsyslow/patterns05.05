package com.company.factory.colt;

import com.company.factory.*;

/**
 * Created by admin on 03.05.2017.
 */
public class ColtFactory implements WeaponFactory {
    @Override
    public Revolver createRevolver() {
        return new ColtRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new ColtRifle();
    }

    @Override
    public Gun createGun() {
        return new ColtGun();
    }

    @Override
    public BFG creareBFG() {
        return new ColtBFG();
    }
}
