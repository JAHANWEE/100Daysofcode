package oops;

class Mobile{
    String brand;
    int price;
    static String name;
    static{
        name="Phone";
        System.out.println("IN STATIC BLOCK");  
    }
    public Mobile(){
        brand ="";
        price = 200;
    }
    public void show(){
        System.out.println(brand+" : "+price+" ; "+name);
    }
}
public class methodss {
    public static void main(String[] args){
        Mobile obj = new Mobile();
        obj.brand ="Apple";
        obj.price=1300;
        obj.name="Smartphone";
        
        Mobile obj1 = new Mobile();
        obj1.brand ="Samsung";
        obj1.price=1200;
        obj1.name="Smartphone";

        obj.show();
        obj1.show();
        
    }
}