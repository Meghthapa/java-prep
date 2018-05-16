package unaryOperators;

/**
 * Created by meght on 3/11/2018.
 */
public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
        //Increment and decrement be careful, have higher order than (+,-,*,/,..)
        //myint = myInt +1;
        // int otherint = myint;
        int myint = 5; // Pre increment
        int otherint = ++myint;
        System.out.println("Myint="+ myint+" otherint="+otherint);

        //POST increment
       int newInt = 5;
       //int newOtherint= newInt;
       //newInt = newInt +1;
       int newOtherint = newInt++;
        System.out.println("newInt="+newInt+" newotherInt="+newOtherint);

        int count = 0;
        System.out.println(count);
        System.out.println(++count);
        System.out.println(count);
        System.out.println(count--);//print 1 and also count set to 0
        System.out.println(count);

        //exam question
        int  e= 3;
        int f = ++e * 5/e-- + --e;
         // 4 * 5/ 4 + --e, -> e=3 -> --4 ->3
        //4*5 / 4+2; --3 -> e=2;
        // 5+2
        // 7
        System.out.println("e="+e+" f="+f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 +2 * g++ - h-- % --g;
        // h = 3 ; g= 6
        //3 + --g * 3 +2 * g++ - h-- % --g
        //h= 3 ; g =6;
        // 3+5* 3 +2 * g++ - h-- % --g
        // 3+5 * 3+2*5 -h-- % --g
        // h =2 , g=6;
        // 3+5 * 3+2*5 - 3%5
        // g= 5
        // 3+15 +10 -3
        // 18 + 10 - 3
        //25
        System.out.println("g="+g+" h="+h+" i="+i);

    }
}
