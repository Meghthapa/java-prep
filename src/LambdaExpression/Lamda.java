package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meght on 4/16/2018.
 */
class Animal {
    private String type;
    private boolean canJump;
    private boolean canSwim;

    public Animal(String type, boolean canJump, boolean canSwim) {
        this.canJump = canJump;
        this.canSwim = canSwim;
        this.type = type;
    }

    public boolean canJump() {
        return canJump;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String GetType() {
        return type;
    }
}
    interface CheckAnimal{
        boolean check(Animal animal);
    }

    interface AnotherCheck{
     boolean check(Animal first, Animal second);
    }


    class CheckCanJump implements CheckAnimal{
        @Override
        public boolean check(Animal animal) {
            return animal.canJump();
        }
    }

public class Lamda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("Rabbit",true,false));
        animals.add(new Animal("Dog",true,true));

        Animal fish = animals.get(0);
        Animal rabbit = animals.get(1);
        Animal Dog = animals.get(2);
        print(fish,rabbit,((first, second) -> first.canJump() && second.canSwim() ));
        print(rabbit,Dog,((first, second) -> first.canSwim() && second.canSwim()));

//        print(animals,animal -> animal.canJump());
//        print(animals,animal -> animal.canSwim());
//        print(animals,animal -> !animal.canSwim());

        print(animals,(Animal animal)->{
            return animal.canSwim();
        });

        print(animals,(Animal animal)->{
            System.out.println("checking Animal="+ animal.GetType());
            return animal.canJump();
        });

    }
    private static void print(List<Animal> animals, CheckAnimal filter){
         for(Animal animal: animals){
             if(filter.check(animal)){
                 System.out.println(animal.GetType());
             }
         }
        System.out.println();
    }
    private static void print(Animal first,Animal second,AnotherCheck check){
        System.out.println(check.check(first,second));
    }
}
