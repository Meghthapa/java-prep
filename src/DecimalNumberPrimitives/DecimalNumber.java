package DecimalNumberPrimitives;

/**
 * Created by meght on 3/2/2018.
 */
public class DecimalNumber {
    public static void main(String[] args) {
        float myNumber = 23.4f;

        //double before = 10_.25; // does not compile
        //double after = 10._25; // does not complie
        // double first = _10.25; // does not compile

        //double last= 10.25_;//does not complile
         double mydouble = 2.54;
         double mydouble2 =2.54;

         double anotherdouble =2.54;//d can be used for double but its optional
        double scientific0= 5.000145E3;
         double scientific = 5.000145E03;// this is legal its means 5000.125 (Last 03 means move 3 letter inside)
        double mydouble3 = 5000.145;
        System.out.println("scientific="+ scientific+ " another scientific ="+ scientific0+" mydouble3 "+ mydouble3);

        double hexpi= 0x1.91eb851eb851fp1;// p indicates hexadecimal floating point number

        System.out.println("hexpi= "+ hexpi);




    }
}
