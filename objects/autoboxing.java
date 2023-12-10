package objects;

public class autoboxing {
    public static void main(String[] args){
        Integer v =5;
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(2, 6));
        

        Integer a =100;
        int b = a;   //unboxing - prmitive data types ae faster than wrapper classes
        System.out.println(b);
        System.out.println(a);


        // Integer x = 10;
        // Integer y = 10;

        // if (x == y) System.out.println("Equal");
        // else System.out.println("Not equal");

        // Integer x = 5.2;
        // Integer y = 4.3;

        // System.out.println(x + y);
        Integer x = 5;
        Character y = 'x';   //120
        Double z = 2.1;

        System.out.println(x + y + z); //127.1 because integer is first
    }
}
