package Inheritance;

/**
 * Created by meght on 4/9/2018.
 */
public interface Walk extends Run{
    default int getSpeed(){
        return 5;
    }
}
