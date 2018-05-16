package HandlingException;

/**
 * Created by meght on 4/15/2018.
 */

class MeseumClosed extends RuntimeException{

}
class MesuemClosedForLunch extends MeseumClosed{

}
public class CatchingDiffException {
    public static void main(String[] args) {

      Calculate();
//        try{
//            VisitMeseum();
//        }catch (MesuemClosedForLunch l){
//            System.out.println("Closed for lunch come back in 2 hours");
//        }catch (MeseumClosed c){
//            System.out.println("Mesuem is closed please visit 1 hours");
//        }

    }
//    public static void VisitMeseum(){
//        boolean b =Math.random()< 0.5;
//        if(b) {
//            throw new MeseumClosed();
//        }
//        throw new MesuemClosedForLunch();
//
//    }
    public static String Calculate(){
        String result ="";
        String str = null;
        try{
            try{
                result += "Start";
                str.length();
                result += "end";
            }catch (NullPointerException e){
                result +="npe";
                throw new RuntimeException();
            }finally {
                result += "Finally";
                throw new Exception();
            }
        }catch (Exception e){
            result +="Finished";
        }
        return result;
    }
}
