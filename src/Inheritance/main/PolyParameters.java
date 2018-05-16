package Inheritance.main;

import Inheritance.*;

/**
 * Created by meght on 4/9/2018.
 */
public class PolyParameters {
    public static void main(String[] args) {
        Husky husky = new Husky(3);
        husky.setName("Puppy");
        PrintDetails(husky);

        Rabbit rabbit = new Rabbit();
        rabbit.setName("Muso");
        PrintDetails(rabbit);

  }
//    public static void PrintDetails(Husky husky){
//        husky.printDetail();
//    }
//    public static void PrintDetails(Rabbit rabbit){
//        rabbit.printDetail();


    Animal rex = CreateAnimal("rex",4);


    Animal bunny = CreateAnimal("bunny",3);


    public static void PrintDetails(Animal animal){
        animal.printDetail();
    }

        public static Animal CreateAnimal(String name,int age){
            if(name.equals("rex")){
                Animal husky = new Husky(age);
                husky.setName(name);
                return husky;
            }else if(name.equals("bunny")){
                Animal cat = new Cat(age);
                cat.setName(name);
                return cat;
            }else {
                Animal rabbit = new Rabbit(age);
                rabbit.setName(name);
                return rabbit;
            }
        }
   }
