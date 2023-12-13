package oops;

class Mobiles{
    String brand;
    int price;
    static String name;

    public void show(){
         System.out.println(this.brand+" : "+this.price+" ; "+this.name);
    }
    public static void show1(){
        System.out.println(this.brand+" : "+this.price+" ; "+this.name);
    }
}
public class staticm {
    public static void main(String[] args){
        Mobiles obj = new Mobiles();
        obj.brand ="Apple";
        obj.price=1300;
        Mobiles.name="Smartphone";

        Mobiles obj1 = new Mobiles();
        obj1.brand ="Samsung";
        obj1.price=1200;
        Mobiles.name="Smartphone";

        obj.show();;
        obj1.show();

        Mobiles.show1();
    }
}
