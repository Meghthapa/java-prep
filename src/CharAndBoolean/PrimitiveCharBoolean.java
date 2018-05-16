package CharAndBoolean;

/**
 * Created by meght on 3/2/2018.
 */
public class PrimitiveCharBoolean {
    public static void main(String[] args) {
        char a ='a';
        //char b = 'ab';// this is not allowed in java
        char c = '1';// this is consider as char not number
        char unichar = '\u03A9'; // upper case greek omega character
        char romannumber = '\u216C';//roman 50 number

        System.out.println("c ="+ c);
        System.out.println("unichar = "+ unichar);
        System.out.println("romannumber= "+ romannumber);


        boolean myboolean= true;
        boolean myFalseboolean= false;

        System.out.println("myboolean = "+myboolean );
        System.out.println("myFalseBoolean= "+ myFalseboolean);

    }
}
