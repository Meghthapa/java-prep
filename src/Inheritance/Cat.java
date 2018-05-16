package Inheritance;

/**
 * Created by meght on 4/5/2018.
 */
public class Cat extends Animal implements Run {

    public Cat(int age){
        super(age);
    }

    @Override
    public int getSpeed() {
        return 15;
    }
}
