package objects;

public class math {
    public static void main(String[] args){
        int min = Math.min(10 , 3);
        int max = Math.max(10 , 20);

        System.out.println(min);
        System.out.println(max);
        

        // round off
        System.out.println(Math.floor(3.2)); //3.0
        System.out.println(Math.ceil(3.9));  //4.0
        System.out.println(Math.round(3.5));//4.0 that is any value greater than .5 goes off to greater value


        // logarthmic and exponential 
        double E = Math.E;
         System.out.println(E);   //2.718281828459045
        double log = Math.log(E); //log of e  with base e
        System.out.println(log); //1.0
        double ten = Math.log10(100); // log of 100 with base 10
        System.out.println(ten);  //2.0

        System.out.println(Math.pow(2,3)); //8.0
        System.out.println(Math.sqrt(25)); //5.0


        //Trigonometry functions
        final double pi =Math.PI;
        System.out.println(pi);

        System.out.println(Math.sin(pi/6)); //   0.49999999999999994   it is sin(180/6)is sin30 degrees that is 0.5
        
         //degrees is not used here only radians are used
        System.out.println(Math.sin(0)); //0.0
        System.out.println(Math.cos(pi/3));  //0.5000000000000001
        System.out.println(Math.cos(0));  //1.0

    }
}
