package objects;

class ComplexNumber{
    int real;
    int imaginary;
    

    // constructor
    ComplexNumber(int real_num , int imag){
      this.real = real_num;  //this refers to instance varaibles
      imaginary=imag;
    }
    void print(){
         System.out.println(this.real+" + "+this.imaginary+"i");
    }

    //add method
    ComplexNumber add(ComplexNumber y){
        int sumReal = real+y.real;
        int sumImag=imaginary+y.imaginary;
        ComplexNumber res = new ComplexNumber(sumReal, sumImag);
        return res;
    }
}
public class complex_num {
    public static void main(String[] args){
        ComplexNumber x = new ComplexNumber(2,3);
        // x.real=2;
        // x.imaginary=3;
        ComplexNumber y = new ComplexNumber(-5,4);
        // System.out.println(x.real);
        // System.out.println(x.imaginary);

        x.print();
        y.print();

        ComplexNumber z = x.add(y);
        z.print();

        
    }
}
