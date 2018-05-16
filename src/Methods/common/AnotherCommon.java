package Methods.common;

/**
 * Created by meght on 3/31/2018.
 */
public class AnotherCommon {
    public static void main(String[] args) {
     common common= new common();
     common.publicPrint();
     common.defaultPrint();
     common.protectedPrint();


        System.out.println("PublicNumber ="+common.publicNumber);
        System.out.println("ProctedNumber ="+common.protectedNumber);
        System.out.println("defaultNumber ="+common.defaultNumber);
       // System.out.println("privateNumber ="+common.privateDefault);

    }
}
