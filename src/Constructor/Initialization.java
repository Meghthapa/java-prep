package Constructor;

/**
 * Created by meght on 4/3/2018.
 */

class example{
    private String name="dog";
    {
        System.out.println(name);
    }
    private static int COUNT =0;

    static {
        System.out.println(COUNT);
    }
    {
        COUNT +=10;
        System.out.println(COUNT);
    }
    public example(){
        System.out.println("Constructor");
    }

}
public class Initialization {


    public static void main(String[] args) {
        example example = new example();

        // ways of call 1st static method 2nd instance initializer , constructor


    }
}
