package com.company.factory.beretta;

import com.company.factory.*;

/**
 * Created by admin on 03.05.2017.
 */
public class BerettaFactory implements WeaponFactory {

    @Override
    public Revolver createRevolver() {
        return new BerettaRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new BerettaRifle();
    }

    @Override
    public Gun createGun() {
        return new BerettaGun();
    }

    @Override
    public BFG creareBFG() {
        return new BerettaBFG();
    }
}
