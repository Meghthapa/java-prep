package ConditionalOperator;

/**
 * Created by meght on 3/13/2018.
 */
public class Conditional {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean d = a && b;// false
        boolean e = a||b;//true

        System.out.println("d= "+ d);
        System.out.println("e= "+ e);

        int f = 4;
        boolean g = false && (f++ <4);//(f++ <4) is never executed (short-circuiting)
        boolean h = (f--==4)&& !g;// true && !g,f=3

        System.out.println("f="+f);
        System.out.println("g="+g);
        System.out.println("h="+h);

    }
}
