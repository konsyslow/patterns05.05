package com.company.factory;

/**
 * Created by admin on 03.05.2017.
 */
public interface WeaponFactory {
     Revolver createRevolver();
     Rifle createRifle();
     Gun createGun();
     BFG creareBFG();
}
