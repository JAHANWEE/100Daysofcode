package oops;
class calculator{
    int a=0;       //instance variable
    public int add(){
        System.out.println("in add");
        return 5;
    }
    public int add1(int a , int b){   //a, b are local variable
        // int r = a+b;
        // System.out.println(r);
        return a+b;
    }

}
public class demo {
    public static void main(String[] args){
        calculator cb = new calculator();
        // calculator:type   cb: variable of type calculator = new 
        cb.add();  // calls add function
        int r = cb.add(); //returns the value passed by the function
        System.out.println(r);    //5
        System.out.println(cb.add1(5,6));

    }
}
