package oops;
class A{ // A is a superclass
    public A(){ //constructor of A class
        super();
        System.out.println("in A");
    }
    public A(int n ){
        super();
        System.out.println("in A int");
    }
}
class B extends A{  // B is a subclass
    public B(){   // constructor of B class
        // this(); excutes method of same class
        System.out.println("in B");
    }
    public B(int n ){
        super(n);  // means call constructor of super class
        System.out.println("in B int");
    }
}
public class defaut {
    public static void main(String[] args){
        B obj = new B(8);
    }
}
// when object is made , it calls both the constructors of superclass as well as subclass.
//Every constructor in java has a method super :

