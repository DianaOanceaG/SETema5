package com.tema.abstractf.planes;

/**
 * Created by Diana on 16-Nov-14.
 * this is the factory which produces concrete plane factories such as BoeingPlaneFactory and TextronPlaneFactory
 */
public abstract class PlaneAbstractFactory {

    public abstract Plane createPlane(String type);//type will specify the type of plane we are creating
    /**this method must be overwritten by the two class factories:
     * 1.BoeingPlaneFactory
     * 2.TextronPlaneFactory
     */

}
