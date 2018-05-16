package PrimitiveWrapperTypes;

/**
 * Created by meght on 3/6/2018.
 */
public class WrapperTypes {
    public static void main(String[] args) {
        int myInt= 10;

        //This is a wrapper
        Integer myInteger= new Integer(10);
        Integer myInteger2 =20;
        Integer myInteger3=Integer.valueOf(10);
        Integer myInteger4= Integer.parseInt("3");
        Integer myInteger5 = null;

        //int cannot hold null
        // int myint2 = null;

        System.out.println("myInteger= "+ myInteger);
        System.out.println("myInteger2= "+myInteger2);
        System.out.println("myInteger3= "+ myInteger3);
        System.out.println("myInteger4 "+ myInteger4);
        System.out.println("myInteger5= "+ myInteger5);

        //converting wrapper to primitive -> unboxing
        int myInt3 = myInteger3;//unboxing
        //int myInt4 = myInteger5;// throws null pointer exception primitive cant contain null

        //Boxing -> converting primitive to wrapper
        Integer myInteger6 = new Integer(10);
        Integer myInteger7 = myInt;
        printSum(1,5);// outerBoxing
        printSum(myInteger,myInteger2);

        String A$B = "Wass up honeymoon";
        int _hello=20;
        int Public = 20;

        Short myPets=5;

        boolean empty;



    }
    private static void printSum(Integer first,Integer second){
        System.out.println("Sum= "+ (first + second));
    }
}
