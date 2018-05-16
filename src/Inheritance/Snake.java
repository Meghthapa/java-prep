package Inheritance;

import Inheritance.Reptile;

/**
 * Created by meght on 4/8/2018.
 */
public class Snake extends Reptile {

    @Override
    protected boolean haslegs(){
        return false;
    }
    @Override
    protected double getweight(){
        return 10;
    }
}
