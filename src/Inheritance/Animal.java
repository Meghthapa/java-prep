package Inheritance;

/**
 * Created by meght on 4/5/2018.
 */
public class Animal  {
    private int age;
    protected String name;

    public Animal(){}

    public Animal(int age){
        System.out.println("Animal");
        this.age= age;
    }

    public void setage(int age){
       this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void printDetail(){
        System.out.println("get age= "+ age+" name ="+ name);
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public double getAverageWeight(){
        return 10.0;
    }
    //public static abstract void run(); does not compile

     //public abstract void run(){
        // abstract method cant have method body
    //}

}
