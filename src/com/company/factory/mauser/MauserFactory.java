package com.company.factory.mauser;

import com.company.factory.*;

/**
 * Created by admin on 03.05.2017.
 */
public class MauserFactory implements WeaponFactory {
    @Override
    public Revolver createRevolver() {
        return new MauserRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new MauserRifle();
    }

    @Override
    public Gun createGun() {
        return new MauserGun();
    }

    @Override
    public BFG creareBFG() {
        return new MauserBFG();
    }
}
