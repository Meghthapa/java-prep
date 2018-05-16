package PracticeProjects;

import java.util.Scanner;

/**
 * Created by meght on 4/20/2018.
 */
public class Java {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      Reverse("a");

      String details = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";



    }

        public static void Reverse (String a){
            System.out.println("Please Enter your phrase");
            StringBuilder input1 = new StringBuilder();
            a = scanner.next();
            input1.append(a);

            input1 = input1.reverse();

            System.out.println(input1);


        }
        public static void count(int x){


        }


    }
