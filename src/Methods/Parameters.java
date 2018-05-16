package Methods;

/**
 * Created by meght on 3/31/2018.
 */
public class Parameters {

    int getZero(){
        return 0;// 0 argument(niladic => mehod with 0 argument)
    }
    int increment(int number){// method with 1 argument(monadic)
        return number++;//
    }
    int sum(int a, int b){//method with 2 argument (dyadic)
        return a +b;
    }
    int plusMinus(int a,int b, int c){// 3 arguments (triadiac)
       return a + b - c;
    }
    double average(double a, double b,double c,double d){ // 4 argument (polyadiac)
        return (a+b+c+d);
    }

    //void test {} does not compile no brackets
     //void test(int a; int b){} does not compile

    void test(int a , int b){}// this is compile because void not return anything


}
