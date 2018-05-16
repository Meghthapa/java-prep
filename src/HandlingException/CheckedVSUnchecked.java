package HandlingException;

import javax.management.RuntimeErrorException;

/**
 * Created by meght on 4/14/2018.
 */
public class CheckedVSUnchecked  {
    public static void main(String[] args)throws Exception {
    // anotherMethod();
      myMethod();
    }
    public static void myMethod() throws Exception{
        throw new Exception("Faied to Load");
    }
    public static void anotherMethod()throws RuntimeErrorException{
        throw new RuntimeException("Wrong parameter");
    }
}
