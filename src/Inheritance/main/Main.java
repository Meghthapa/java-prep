package Inheritance.main;

import Inheritance.*;

/**
 * Created by meght on 4/5/2018.
 */
public class Main {
    public static void main(String[] args) {
      Husky husky= new Husky(12);

      husky.printDetail();
      husky.printDetail();


//      Dog dog = new Dog(3);
//      dog.setName("Rex");
//      dog.printDetail();
     husky.eat();
        System.out.println("avgs"+ husky.getAverageWeight());
        System.out.println("Husky "+husky.getDefaultTailLength());
        husky.run(20);
        Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setage(20);
        bear.eatMeat();
        bear.eatPlants();
        Rabbit rabbit = new Rabbit();
        rabbit.eatplant();








    }
}
