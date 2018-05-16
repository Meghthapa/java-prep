package Primitive;

/**
 * Created by meght on 2/28/2018.
 */
public class WholeNumberPrimitive {
    public static void main(String[] args) {
        long max = 12345678940L;
        long n= 2_300;


        //Octal number (0-7)
        int oct = 07;
        int firstoctal = 010;
        int secondoct = 022;
         int sumoct= firstoctal+secondoct; // 26 decimal,32 octal
        System.out.println("first="+ firstoctal+"Secondoct="+secondoct);
        System.out.println("decimal sum="+sumoct+" octSum="+ Integer.toOctalString(sumoct));

        //hexadecimal (0-9) and (A-F)
        int firstHex = 0xF;
        int secondHex = 0x1E;

        System.out.println("First= "+ firstHex +" second="+ secondHex);


        //Binary Numbers
        int firstbin =0b1001;//9 decimal
        int secondbin = 0b01111;//7 decimal
        int sumbin = firstbin + secondbin;
    }
}
