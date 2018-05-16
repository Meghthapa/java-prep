package AssignmentOperator;

/**
 * Created by meght on 3/12/2018.
 */
public class AsiignmentOperator {
    public static void main(String[] args) {

        // int x= 1.0; does not compile
         //short y = 198789456; does not compile
       // int z =9f;does not compile
         // long t = 1923456879787545654;does not compile

        int x= (int)1.0;
        short y = (short) 198789456;//(If you assign a value more than primitive than it is overflow)the largest number in short is 32768
         int z =(int)9f;
         long t = 1923456879787545654L;

        System.out.println("x ="+x);
        System.out.println("y= "+y);
        System.out.println("z="+z);
        System.out.println("t="+t);

        // overflow and underflow with byte (-128 to 127)
        byte myByte = 127;
        byte mySecondbyte = -128;

        System.out.println("myBYte ="+myByte);
        System.out.println("mySecondByte="+mySecondbyte);

        //myByte =myByte+1; did not complie
        myByte++;

        //mySecondbyte = mySecondbyte + 1; did not compile
         mySecondbyte--;

        System.out.println("myBYte ="+myByte);
        System.out.println("mySecondByte="+mySecondbyte);

        short a = 10;
        short b = 20;

        short c = (short) (a*b);

        System.out.println("c="+c);








    }
}
