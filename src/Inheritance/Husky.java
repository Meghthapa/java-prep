package Inheritance;

/**
 * Created by meght on 4/5/2018.
 */
public class Husky extends Dog {

    public Husky(int age){
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
       // super.eat();
        System.out.println("Husky eating ");
        super.eat();
    }

    @Override
    public void run(int speed) {
        System.out.println("Husky is running at "+speed +" speed");
    }



   @Override
    public int getDefaultTailLength() {
       return 20;
    }
}
