package oops;
class Mobile{
    String brand;
    int price;
    String network;
    static String name;   //common to all objects , if you change value then value of all objecs will change 

    public void show(){
        System.out.println(this.brand+" : "+this.price+" ; "+this.name);
    }
}
public class statics {
    public static void main(String[] args){
        Mobile obj = new Mobile();
        obj.brand ="Apple";
        obj.price=1300;
        Mobile.name="Smartphone";

        Mobile obj1 = new Mobile();
        obj1.brand ="Samsung";
        obj1.price=1200;
        Mobile.name="Smartphone";
        
        Mobile.name ="phone";  // should be called with class name        
        obj.show();
        obj1.show();
    }
}
