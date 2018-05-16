package UnderStandingNull;

/**
 * Created by meght on 3/5/2018.
 */
public class Nulldefinition {
    static Object myObject= new Object();
    static Object myotherObj;

    static String mystring;


    public static void main(String[] args) {
     Object mylocalobj= new Object();
     Object anotherobj;

     String name ="java";
     String anothername=null;

        System.out.println("myobject="+ myObject);
        System.out.println("anotherobj= "+ myotherObj);

        System.out.println(mylocalobj);
        //System.out.println(anotherobj);cannot complile
        System.out.println(name);
        System.out.println("Anothername= "+ anothername);


        System.out.println("myString ="+ mystring);
        mystring.toLowerCase();
        System.out.println("myString ="+ mystring);
    }
}
