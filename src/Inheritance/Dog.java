package Inheritance;

/**
 * Created by meght on 4/5/2018.
 */
public class Dog extends Animal implements HasTail,CanRun {
    public Dog(int age){
        super(age);
        System.out.println("Dog");

    }

    @Override
    public void run(int speed) {
        System.out.println("Dog.Run Method called"+ speed);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
    }

    @Override
    public int getDefaultTailLength() {
        return 5;
    }

    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }


}
