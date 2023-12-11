package objects;

import java.math.BigInteger;

public class bigint {
    public static void main(String[] args){
        BigInteger a = new BigInteger("500000000000000000");  //as long cannot store it
        BigInteger b = new BigInteger("1000000000000000000");

        System.out.println(a);
        System.out.println(b);
        BigInteger c = a.add(b);
        System.out.println(c);

        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        
        int x =50;
        BigInteger y = new BigInteger(x+""); //typecasted to string by adding empty string to it
        System.out.println(y);

        //bigInteger to String
         BigInteger b2 = new BigInteger("8797989");
         int v = b2.intValue();
         System.out.println(v);
    }
}
