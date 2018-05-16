package Methods.common;

/**
 * Created by meght on 4/1/2018.
 */
    public class ReturningData {
    public static void main(String[] args) {
        int number =2;
        String word = "xyz";
       number= number(number);
       word= word(word);
        System.out.println(number + " "+ word);
    }

    public static int number(int number){
        number++;
        return number;
    }
    public static String word(String word){
        word += "a"; //xyza
        return word;
    }
}
