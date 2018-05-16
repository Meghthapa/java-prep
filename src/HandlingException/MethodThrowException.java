package HandlingException;

/**
 * Created by meght on 4/16/2018.
 */


class nomoreMeatException extends Exception{

}

class NoMorePlans extends RuntimeException{

}
interface Omnivore{
    void eatMeat(int amount) throws nomoreMeatException;
    void eatPlants(int amount) ;

}
class Bear implements Omnivore {

    @Override
    public void eatMeat(int amount) throws nomoreMeatException {
        if(amount <= 0){
            throw new nomoreMeatException();
        }
        System.out.println("Eating Meat");
    }

    @Override
    public void eatPlants(int amount)   {
     if(amount <=0){
         throw new NoMorePlans();
     }
    }
}
public class MethodThrowException{
    public static void main(String[] args) {


        Bear bear = new Bear();

        try {
            bear.eatMeat(2);
            bear.eatPlants(-2);
        }catch (NoMorePlans e){
            e.printStackTrace();
            System.out.println("Nomore plans exception");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Bear is hungry");
        }finally {
            System.out.println("Finally");
        }


    }
}
