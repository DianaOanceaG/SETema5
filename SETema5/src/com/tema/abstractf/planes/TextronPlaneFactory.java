package com.tema.abstractf.planes;

/**
 * Created by Diana on 16-Nov-14.
 * this the Textron factory which produces:AirLandScorpion and ScorpionISR
 */
public class TextronPlaneFactory extends PlaneAbstractFactory{
    @Override
    /**
     * creating concrete planes manufactured by Textron
     */
    public Plane createPlane(String type) {

        if(type.equalsIgnoreCase("AirLandScorpion"))
            return new AirLandScorpion();
        else
        if(type.equalsIgnoreCase("ScorpionISR"))
            return new ScorpionISR();
        else
            return null;

    }
}
