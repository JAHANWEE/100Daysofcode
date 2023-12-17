package oops;

class Mobiless{
    String brand;
    int price;
    static String name;
    static{
        name="Phone";
        System.out.println("IN STATIC BLOCK");  
    }
    public Mobiless(){
        brand ="";
        price = 200;
    }
    public void show(){
        System.out.println(brand+" : "+price+" ; "+name);
    }
}
public class methodss {
    public static void main(String[] args){
        Mobiless obj = new Mobiless();
        obj.brand ="Apple";
        obj.price=1300;
        Mobiless.name="Smartphone";
        
        Mobiless obj1 = new Mobiless();
        obj1.brand ="Samsung";
        obj1.price=1200;
        Mobiless.name="Smartphone";

        obj.show();
        obj1.show();
        
    }
} 