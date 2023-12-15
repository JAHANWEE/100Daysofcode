package oops;

class Human{
    private int age;  //private is accesible in same class
    private String name;

    //instance variables should be accessed by methods only
    public int getAge(){   //getter
        return age;
    }
    public void SetAge(int a ){
        this.age =a;
    }
    public void setName(String n){    //setter
        this.name=n;
    }
    public String getName(){
        return name;
    }
    //constructor
    public Human(){
       age=12;
       name="Jack";
    }
    public Human(int a , String name){ //Paramterized constructor
        this.age = a;
        this.name = name;
    }
}
public class Demos {
    public static void main(String[] args){
        Human obj = new Human(23 , "Johnson");
        // obj.age=23;
        // obj.name="Dolu";
        // obj.SetAge(23);   
        // obj.setName("Lol");     
        System.out.println(obj.getName()+":"+obj.getAge());

        //this :represents instance variables 
    }
}
