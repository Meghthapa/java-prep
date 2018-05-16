package immutable;

/**
 * Created by meght on 4/4/2018.
 */
public class Complex{
    private final double real;
    private final double imaginary;

   public Complex(double real,double imaginary){
       this.real = real;
       this.imaginary = imaginary;
   }
   public double getReal(){
       return real;
   }
   public double getImaginary(){
       return imaginary;
   }

   public Complex plus (Complex b){
       double newreal = real +b.real;
       double imagenary = imaginary + b.imaginary;
       return new Complex(newreal,imagenary);
   }
   public Complex minus(Complex othercomplex){
       double newminus = real - othercomplex.real;
       double newImaginary = imaginary - othercomplex.imaginary;
       return new Complex(newminus,newImaginary);
   }
   public Complex multiply(Complex multiple){
       double newmultiple = real * multiple.real-imaginary * multiple.imaginary;
       double newmultiple1 = imaginary * multiple.imaginary;
       return new Complex(newmultiple,newmultiple1);

   }
}
