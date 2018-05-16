package PracticeProjects;

/**
 * Created by meght on 4/19/2018.
 */
public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Megh Thapa");
        Sum();
        divide(50,3);
        print();
        multiply(25,5);
        multipleScenerio(125,24);
        Arraynumbrer(10);
        specifiedFormulae(25.5,3.5,40.5,4.5);
        average(4,6,8);
        AmericanFlag();
        swap(16,15);


    }
    public static int Sum(){
        int total = 74 + 36;
        System.out.println(total);
        return total;

    }
    public static int divide(int a,int b){
        int dividetotal=a/b;
        System.out.println(dividetotal);
        return dividetotal;
    }
    public static void print(){
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);
    }

    public static int multiply(int first,int second){
        int totalMultiple= first * second;
        System.out.println("first "+first+" second "+ second + "= "+totalMultiple);
        return totalMultiple;
    }
    public static int multipleScenerio(int a,int b){
        int add = a+b;
        int sub = a-b;
        int multiply = a * b;
        int divide = a/b;
        int mod = a % b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(mod);

        return +add+sub+multiply+divide+mod;

    }
    public static int Arraynumbrer(int a){
        for(int i = 0;i<=10;i++){

            System.out.println(i*a);
        }
        return a;
    }
    public static double specifiedFormulae(double a,double b,double c,double d){
        double e= ((a*b-b*b)/(c-d));
        System.out.println(e);
        return e;
    }
    public static int average(int a,int b,int c){
        int av= (a+b+c)/2;
        System.out.println(av);
        return av;
    }
    public static void AmericanFlag(){
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    }
    public static int swap(int a,int b){
        int temp = a;
        a =b;
        b =temp;
        a=temp;
        System.out.println("a="+a+" b="+b);
        return temp;
    }
}
