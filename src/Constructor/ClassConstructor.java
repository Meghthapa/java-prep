package Constructor;

/**
 * Created by meght on 4/1/2018.
 */

class Dog{
    private String color;

    public Dog(String color){
        System.out.println("Constructor");
        this.color = color;//this refers to class variable
    }
    public void printColor(){
        System.out.println("color ="+ this.color);
    }


   // public void Dog(){}//This is not constructor it has a return type
}
 class cat{
    private String color;
    private int length;
    private int height;

    public cat(int length,int theheight){
     //length= this.length;
        this.length=length;
        height=theheight;
        color = "white";
    }

    public void printinfo(){
        System.out.println("Length="+length+" height="+height+" color="+color);
    }

 }
public class ClassConstructor {
    public static void main(String[] args) {
        Dog dog= new Dog("grey");
        dog.printColor();
        cat Cat = new cat(10,12);
        Cat.printinfo();


    }
}
