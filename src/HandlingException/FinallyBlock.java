package HandlingException;

/**
 * Created by meght on 4/15/2018.
 */
public class FinallyBlock {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[ 0]="Megh";

        try {
            String element = firstToUpperCase(array);
            System.out.println("element=" + element);
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Error message ="+ e.getMessage());
        }finally {
            System.out.println("Finally block");
        }
        String str="";
        try {
            int result=10/0;
            str="a";
        }catch (Exception e){
            str +="b";
        }finally {
            str+="c";
        }
        str+="d";
        System.out.println(str);
    }
    public static String firstToUpperCase(String[] array){
        return array[0].toUpperCase();
    }
}
