package Methods;

import java.util.Arrays;

/**
 * Created by meght on 3/31/2018.
 */
public class VarArgs {

    public void jump1(int... number){}
    public void jump2(int start,int...number){}
    public  void jum5(int[] start,int[] numbers){}
    //public void jum3(int... number,int start){} varargs parameters must be last
   // public void jump4(int...start,int... last){} only needs to have varargs
    public static void main(String[] args) {
        jump(1);
        jump(2,3);
        jump(3,5,6,7);
        jump(4,new int[]{4,5,6});//redundant array creation
        //jump(1,null); null pointer exception
        run();
        run(11,12,13,91,86,25,28);

    }
    public static void jump(int start,int... numbers){
        System.out.println("Start "+ start +" numbers "+ numbers.length);
    }
    public static void run(int... number){
        for(int numbers:number){
            System.out.println("Number= "+numbers);
        }
        System.out.println(Arrays.toString(number));
    }
}
