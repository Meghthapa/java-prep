package Inheritance;

/**
 * Created by meght on 4/8/2018.
 */
public class Rabbit extends Animal implements Herbivore,Run,Hop {




    public Rabbit(){
        //super; does not compile
       // super().setAge(3);does not compile

    }
  public Rabbit(int age){
   //     this(age); recursive call
      //super();
      //setage(3);

      //this();
      //setage(3);
      super(3);
  }

    @Override
    public void printDetail() {
        System.out.println("Rabbit average jump height is="+Hop.getAverageJumpHeight());
    }
}
