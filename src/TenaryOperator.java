/**
 * Created by meght on 3/18/2018.
 */
public class TenaryOperator {
    public static void main(String[] args) {
        int d = 1;
        int e = 2;
        int f = 3;

        if(d < 10){
            f =d++ < 1 ? e++ :f++;
            // d = 2
            // e= 2
            // f= 3
        }else{
            f= (d+e) < 2 ? d++: e++;
        }
        System.out.println(d +", "+e+", "+ f);
    }
}
