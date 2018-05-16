package Methods;

import Methods.common.common;

/**
 * Created by meght on 3/31/2018.
 */
public class AccessModifiers {
    public static void main(String[] args) {
        common common= new common();
        common.publicPrint();

        System.out.println("PublicNumber ="+common.publicNumber);
        //System.out.println("ProctedNumber ="+common.protectedNumber);
        //System.out.println("defaultNumber ="+common.defaultNumber);
        //System.out.println("privateNumber ="+common.privateDefault);
    }
}
