package unaryOperators;

/**
 * Created by meght on 3/10/2018.
 */
public class Uoperators {
    public static void main(String[] args) {
        int x= +3;//+ sign is redundent
        System.out.println(x);

        double y = -3;//This does not chanage any value

        System.out.println("x="+x+" y="+y);

         y = -y;// - 1 * y
        System.out.println("x="+x+" y="+y);

        boolean a = true;
        boolean b = !a;

        System.out.println("a="+a+" b="+b);

        b=!b;
        System.out.println("b="+b);

        // int myint = !5; // Does not compile
       //boolean mybooolean= - true;// does not compile
        //boolean z=!0;//does not complile

    }
}
