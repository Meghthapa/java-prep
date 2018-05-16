package Methods.StaticMethodAndField;

/**
 * Created by meght on 3/31/2018.
 */
public class Static {
    private String name="static";//instance field
    public static void one(){}
    public static void two(){}

    public static void three(){
        one();
        two();

    }
    public void four(){
        one();
        two();
        three();
        System.out.println(name);

    }

    public static void main(String[] args) {
        one();
        two();
        three();
        //four()//not static
        Static myInstance = new Static();
        myInstance.four();

        new Static().four();
    }

}
