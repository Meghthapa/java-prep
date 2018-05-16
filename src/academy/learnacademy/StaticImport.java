package academy.learnacademy;

/**
 * Created by meght on 2/28/2018.
 */
import  static  java.lang.Math.PI;
  import static java.lang.Math.min;
  import static java.lang.System.out;
  import static academy.learnacademy.Config.*;



  public class StaticImport {
    public static void main(String[] args) {
        int min = min(2,5);
        out.println(min);
        out.println(PI);

        Config.PrintConfig();

        out.println("Name= "+ Name+ " Count= "+ Max_COLUMN_Count);
    }
}
