package Methods;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meght on 3/31/2018.
 */
public class FinalVariables {
    private static final int size = 10;
    private static final List<String> vlaues = new ArrayList<>();
    public static void main(String[] args) {
        int[] myint = new int[size];
       // size = 11;// not comile cannot assign a value in variable, Final variables cannot be change

        for(int i =0;i<size;i++){
            System.out.println(myint[i]);
        }
       vlaues.add("Changed");
      //  vlaues = new ArrayList<>(); does not compile

        final int mynumber = 10;
        //mynumber= 11; does not compile


    }
}
