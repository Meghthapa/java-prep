package Inheritance;

/**
 * Created by meght on 4/8/2018.
 */
public interface Herbivore {
    //void eatplant();
    //default int getRequiredPlantAmount();

//    public int getRequiredPlantAmpunt(){
//        return;
//    }
    default void eatplant(){
        System.out.println("Eating plants");
    }
}
