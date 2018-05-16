package Methods.StaticMethodAndField;

/**
 * Created by meght on 3/31/2018.
 */
public class Counter {

    public static int count;
    public int anothercount;

    public Counter(){
        count++;
        anothercount++;
    }

    public static void main(String[] args) {
        Counter one = new Counter();
        Counter two = new Counter();
        Counter three = new Counter();
        Counter four = new Counter();

        System.out.println(count);
        System.out.println(one.anothercount);
        System.out.println(two.anothercount);
        System.out.println(three.anothercount);
        System.out.println(four.anothercount);

        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

        one.anothercount =2;
        two.anothercount = 3;
        three.anothercount= 4;
        four.anothercount = 5;

        System.out.println(one.anothercount);
        System.out.println(two.anothercount);
        System.out.println(three.anothercount);
        System.out.println(four.anothercount);
    }
}
