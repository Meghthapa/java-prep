package Constructor;

/**
 * Created by meght on 4/2/2018.
 */

 class Dog2{
   private String name;
   private String breed;
   private double weight;

   public Dog2(String name){
//       this.name=name;
//       breed ="Husky";
//       weight = 30.2;

       this(name,"Husky");
       System.out.println("Constructor 1");
   }
   public  Dog2(String name,String breed){
//       this.name=name;
//       this.breed=breed;
//       this.weight = 30.0
       this(name,breed,30.0);
       System.out.println("Constructor 2");
   }
   public Dog2(String name,String breed,double weight){
       this.name=name;
       this.breed = breed;
       this.weight = weight;
       System.out.println("Constructor 3");
   }
   public void print(){
       System.out.println(name+" "+breed+ " "+ weight );
   }

}
public class Overloading {
    public static void main(String[] args) {
      Dog2 dog2= new Dog2("puppy");
        dog2.print();
        Dog2 dog3 =new Dog2("Rex","husky");
        dog3.print();
        Dog2 dog4 = new Dog2("Anthony","German shephard",30.2);
        dog4.print();
    }
}
