package SwitchStatement;

import java.util.Random;

/**
 * Created by meght on 3/18/2018.
 */
public class Switch {
    public static void main(String[] args) {
        int dayOfweek =0;

        switch (dayOfweek){

            case 0:
                System.out.println("Monday");
                //break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
                case 5:
                    System.out.println("Weekend");
                    break;


        }

        Random rand = new Random();
        int c = rand.nextInt(26) +'a';// adding ofset to produce lower case
        System.out.println((char)c+", "+c+" : ");

        switch (c){
            case 'a':
            case 'e':
            case'i':
            case '0':
            case 'u':
                System.out.println("vowel");
                break;
                default:
                    System.out.println("constant");
        }

    }
}
