package com.tema.abstractf.planes;

/**
 * Created by Diana on 16-Nov-14.
 *
 * helps the client in producing specific factories
 */
public class FactoryProducer {
    /**
     * this method helps us to create concrete PlaneFactory objects
     *
     *@param factorytype  The type of the plane factory, Boeing or Textron
     * */
    public static PlaneAbstractFactory getPlaneFactory(String factorytype)
    {
        if(factorytype.equalsIgnoreCase("Boeing"))
            return new BoeingPlaneFactory();
        else
        if(factorytype.equalsIgnoreCase("Textron"))
            return new TextronPlaneFactory();
        else
            return null;
    }
}
