package com.tema.abstractf.planes;

/**
 * Created by Diana on 16-Nov-14.
 * this the Boeing factory which produces:Boeing737, Boeing787Dreamliner and BoeingChinook
 */
public class BoeingPlaneFactory extends PlaneAbstractFactory{
    @Override
    /**
     * creating concrete planes manufactured by Boeing
     */

    public Plane createPlane(String type) {

        if(type.equalsIgnoreCase("Boeing737"))
            return new Boeing737();
        else
        if(type.equalsIgnoreCase("Boeing787Dreamliner"))
            return new Boeing787Dreamliner();
        else
        if(type.equalsIgnoreCase("BoeingChinook"))
            return new BoeingChinook();
        else
            return null;

    }
}
