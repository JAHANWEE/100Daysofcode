package oops;
class L{
    public int show(){
        return 7;
    }
    public void config(){
        System.out.println("in A config");
    }
}
class M extends L{
    public int show(){
        return 89;
    }
}
public class overridinning {
    public static void main(String[] args){
        M obj = new M();
       int r1= obj.show();
       System.out.println(r1);
        obj.config();
    }
}
