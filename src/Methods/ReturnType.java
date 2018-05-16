package Methods;

/**
 * Created by meght on 3/31/2018.
 */
public class ReturnType {

    public String jump1(){return "";}
    //public jump12(){}// does not compile because it does not have any return type


    String jump2(int a){
        if(a==5){
            return "";
        }
        return "abc";
    }

    int jump3(){
        return 10;
    }
    int getLong(){
        return (int)9L; // does not compile
    }
    boolean isTrue(){
        //return 5 < 10;
        return 5 == 5;
    }
    public void test(){}
   // public void 1test(){}//cannot compile

    public void $test(){}// rule of valid naming is you can add special character and "_" in method name
    public  void _anotherTest(){}



}
