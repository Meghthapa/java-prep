package Methods.StaticInitialization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meght on 3/31/2018.
 */
public class Intialization {

    private static final int SIZE;
    private static final int one;
    private static final  int two;
    private static final int three = 10;
    private static List<String> mylist = new ArrayList<>();
    private static final int four;

    static {
        System.out.println("first static init");
        int rows = 5;
        int columns = 4;
        SIZE = rows * columns;
    }
    static {
        System.out.println("Second static init");
        one = 1;
        two =2;
        four =3;

    }
    static {
        System.out.println("third static init");
        mylist.add("Jimmy");
        mylist.add("timmy");
    }
    public static void main(String[] args) {
        System.out.println(mylist);

    }
}
