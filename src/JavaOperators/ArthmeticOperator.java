package JavaOperators;

/**
 * Created by meght on 3/7/2018.
 */
public class ArthmeticOperator {
    public static void main(String[] args) {
        int result = 3 - 2+ 2*2+3;
        //3 - 2 + 4 + 3
        //1 + 4 + 3
        // 5 +  3
        //8
        System.out.println("result = "+ result);

        result = 4/2 + 1 -4 * 2 + 10;
        //2+1-8+10
        //3 -8 + 10
        //-5 + 10
        //5
        System.out.println("result2= "+result);

        //unirary operators

        int a = 4;
        int b =3 - 2 * --a;// -- is decrement then use
        // 3-6
        //b = -3 a = 3
        System.out.println("a= "+ a + " b= "+ b);

        a = 4;
        b = 3 -2 * a--;//Use a then decrement a=a-1
        //3-2 *4
        //3-8
        //b=>-5 & a=4
        System.out.println("a= "+a+" b="+b);

        // increment operator
        long c=2;
        long d= 4+3 * c++;//use then increment c= c+1
        //4+6
        //10
        System.out.println("c="+c+" d="+d);

        result = 10 -3 *(2+1)-4/(1+3);//brackets have higher precedence
         //10-3 *3 -4/4
        //10-9-1
        //0
        System.out.println(result);

        //modulas operator

        int i = 10;
        int j = 3;

        //10 % 3 = 10/3 -> 3*3 = 9 -> 10-9 =1
        int k = i%j;
        //10 % 2 = 10/2=5 -> 5*5=10 ->10-10 =0
        int e = 10 % 2;
        System.out.println("k="+k+" e="+e);

        //20%2 = 20/2=10 -> 10*2=20 -> 20-20 =0
        k= 20 % 2;
        System.out.println("k="+k);

        // 40%2=40/2 =20->20*2=40->40-40=0
        e= 40 % 2;
        System.out.println("e="+e);

        //10/2 =50 -> 50*2=100 ->100-100=0
        int m = 100 %2;
        System.out.println("m="+m);

        //50/3 = 16 -> 16*3 -> 50-48 =4
        //10/7 = 1 -->1*3=3 ->
        int s = 50 % 3;
        System.out.println("s="+s);

        int f= 12;
        int g= 5;
        int h = 2;

        int t = f/2 -10%(4+3)-2 *f%g - h * 3;//first precedence is brackets
        //12/2-10%7- 2 * 12%5 - 2*3
        //6 - 3 -24%5 -6
        //6-3-4-6
        //3-4-6
        //-1-6
        //-7
        System.out.println("m= "+t);

    }
}
