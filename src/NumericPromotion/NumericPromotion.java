package NumericPromotion;

/**
 * Created by meght on 3/8/2018.
 */
public class NumericPromotion {
    public static void main(String[] args) {
        // promotion is converting "smaller" int "bigger" type for eg
        int x = 5;
        double y = 10.55;

        //double result = x+y; int is converted into double
        System.out.println("x+y= "+(x+y));

        byte b = 10;
        int c = 5;
        double d = 4.5;

        double result = b+c+d;// it is promoted to double
        System.out.println(result);

        // casting is converting "bigger" type to "smaller"

        double myDouble = 10.5;
        int myInt = 4 + (int)myDouble;
        System.out.println("my Int = "+myInt);

        int anotherInt = 125;
        byte myByte = 15;

        int intresult = anotherInt +myByte;
        byte byteresult = (byte)(anotherInt + myByte);

        System.out.println("intResult ="+ intresult);
        System.out.println("ByteResult= "+byteresult);

        double a = 15.5;
        float t = 20.5f;

        double total = a+t;

        int a1 = 10;
        double a2= 5.2;
        float a4 = 20.5f;
       double a3 = (a1 + a2);
        System.out.println(a3 +a4);




    }
}
