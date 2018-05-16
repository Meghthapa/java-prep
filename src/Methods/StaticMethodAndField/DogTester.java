package Methods.StaticMethodAndField;

/**
 * Created by meght on 3/31/2018.
 */
public class DogTester {
    public static void main(String[] args) {
     Dog husky = new Dog();
        System.out.println(husky.counter);// warning
        System.out.println(Dog.counter);

        Dog anotherDog = new Dog();
        anotherDog.incrementCounter();// waring

        Dog.incrementCounter();// is the way to call static method

        System.out.println(Dog.counter);
        husky =null;
        anotherDog = null;
        System.out.println(Dog.counter);
        System.out.println(husky.counter);
        System.out.println(anotherDog.counter);

        Dog.counter = 10;
        Dog newdog = new Dog();
        Dog dog2 = new Dog();
        newdog.counter= 5;
        newdog.counter= 11;

        System.out.println(Dog.counter);

    }
}
