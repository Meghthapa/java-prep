package Inheritance;

/**
 * Created by meght on 4/8/2018.
 */
public class Bear extends Animal implements Omnivore{
    @Override
    public void eatPlants() {
        System.out.println("bear eating plants");
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear eating meat");
    }


}
