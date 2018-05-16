package Methods.common;

/**
 * Created by meght on 3/31/2018.
 */
public class common {

    public int publicNumber = 10;
    protected int protectedNumber = 20;
    int defaultNumber = 30;
    private int privateDefault = 20;

    public void publicPrint(){
        System.out.println("public");
    }
    protected void protectedPrint(){
        System.out.println("protected");

    }
    void defaultPrint(){
        System.out.println("default");

    }
    private void privateprint(){
        System.out.println("Private");
    }
    public static void main(String[] args) {
     common common= new common();
     common.publicPrint();
     common.privateprint();
     common.defaultPrint();
     common.protectedPrint();

        System.out.println("PublicNumber ="+common.publicNumber);
        System.out.println("ProctedNumber ="+common.protectedNumber);
        System.out.println("defaultNumber ="+common.defaultNumber);
        System.out.println("privateNumber ="+common.privateDefault);

    }
}
