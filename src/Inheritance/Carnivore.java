package Inheritance;

/**
 * Created by meght on 4/8/2018.
 */
public interface Carnivore {
   default void eatMeat(){
       System.out.println("Eating Meat");
   }
}
