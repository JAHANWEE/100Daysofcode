package oops;
class Calcu{   // to stop inheritance 
    public void show(){
        System.out.println("in Calc show");
    }
    public void add(int n1 , int n2){
        System.out.println(n1+n2);
    }
}
class AdvCalcu extends Calcu{

}
public class finals {
    public static void main(String[] args){
        final int num=8;
        // num=89;  // cannot change a final variable
        System.out.println(num);

        Calcu obj = new Calcu();
        obj.show();
        obj.add(2, 67);
    }

}
