package com.tema.abstractf.planes;

/**
 * Created by Diana on 16-Nov-14.
 * class Boeing737, plane produced by Boeing
 */
public class Boeing737 implements Plane {
    @Override
    public void fly() {
        System.out.println("\nI am flying a Boeing737....\n");
    }
}
