package HandlingException;

/**
 * Created by meght on 4/15/2018.
 */
public class Finally {
    public static void main(String[] args) {
        calculate();
    }
    public static int calculate(){
        try{
            return 10/1;
        }catch (ArithmeticException e){
            System.out.println("error");
            System.exit(0);
            return 1;
        }finally {
            System.out.println("Finally");
            return 0;
        }
    }
}
