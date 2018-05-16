package Inheritance.main;

import Inheritance.*;

/**
 * Created by meght on 4/9/2018.
 */
public class Polymorphism {
    public static void main(String[] args) {

      Husky husky = new Husky(5);
        husky.setName("Rex");

      Dog dog = husky;// another reference to Husky object in memory
        dog.printDetail();

        HasTail hasTail = husky;
        hasTail.getDefaultTailLength();

        CanRun canRun = husky;
        canRun.run(20);

       Animal animal = husky;
       animal.getAge();

       Animal cat = new Cat(2);
       Cat myCat = (Cat)cat;
       myCat.getSpeed();
       myCat.printDetail();

      // Bear bear = (Bear)"test";//not related in hierarchy

       // Dog bear = (Dog)cat;//Class class Exception has thrown

        Bird bird = new Bird();
        Object birdObject = bird;

        Eagle eagle = new Eagle();
        Bird eagleBird = eagle;
        Object ObjectBird = eagle;

        Animal rabbit = new Rabbit();
        rabbit.printDetail();
    }
}