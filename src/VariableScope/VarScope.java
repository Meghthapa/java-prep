package VariableScope;

/**
 * Created by meght on 3/4/2018.
 */
public class VarScope {

    static int myNewint;
    public static void main(String[] args) {
        int mylocalInt=10;
        {
            int myotherint=20;
            System.out.println("MyOtherInt= "+ myotherint);
            System.out.println("myLocalint="+ mylocalInt);
        }
        //System.out.println("Myotherint="+myotherint);
        System.out.println("mylocalint= "+ mylocalInt);
        System.out.println("mynewInt= "+ myNewint);
    }
    public static void myMethod(){

    }
}
