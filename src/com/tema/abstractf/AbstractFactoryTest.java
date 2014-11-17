package com.tema.abstractf;

import com.tema.abstractf.planes.FactoryProducer;
import com.tema.abstractf.planes.Plane;
import com.tema.abstractf.planes.PlaneAbstractFactory;

/**
 * Created by Diana on 16-Nov-14.
 * this is the testing point
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {

        //Boeing Factory
        //we get an instance of concrete  BoeingPlaneFactory
        PlaneAbstractFactory boeingPf= FactoryProducer.getPlaneFactory("Boeing");

        //the client creates a Boeing737 plane produced by Boeing factory
         Plane boeing= boeingPf.createPlane("Boeing737");
        //we call the fly() method from Boeing737 class
           boeing.fly();

        //the client creates  a BoeingChinook plane produced by Boeing
        Plane chinook=boeingPf.createPlane("BoeingChinook");
        //call the fly() method from BoeingChinook class
        chinook.fly();

        //the client creates  a Boeing787Dreamliner plane produced by Boeing
        Plane dream=boeingPf.createPlane("Boeing787Dreamliner");
        //call the fly() method from Boeing787Dreamliner class
        dream.fly();

        //Textron Factory
        //we get an instance of concrete  TextronPlaneFactory
        PlaneAbstractFactory textronPf= FactoryProducer.getPlaneFactory("Textron");

        //the client creates  a ScorpionISR plane produced by Textron
        Plane scor=textronPf.createPlane("ScorpionISR");
        //call the fly() method from ScorpionISR class
        scor.fly();

        //the client creates  an AirLandScorpion plane produced by Textron
        Plane scorair=textronPf.createPlane("AirLandScorpion");
        //call the fly() method from ScorpionISR class
        scorair.fly();

        scor=textronPf.createPlane("AirLandScorpion");
        scor.fly();
    }
}
