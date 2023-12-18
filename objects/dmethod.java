package objects;

class Computer{

}
class Laptop extends Computer{

}
class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}
class C extends B{
    public void show(){
        System.out.println("in C show");
    }
}


public class dmethod {
    public static void main(String[] args){

        A obj1 = new B();  // obj type is A but iplementation is B
        obj1.show();  //gives in B show

        A obj2= new A();
        obj2.show();

        obj2 = new B();         // runtime polymorphism
        obj2.show();

        obj2= new C();
        obj2.show();


        Computer lap = new Laptop(); // type parent :object child

    }
}
