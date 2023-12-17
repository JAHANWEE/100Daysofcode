package oops;
// class Calc{
//     public int add(int n1, int n2){
//         return n1+n2;
//     }
//     public int sub(int n1 , int n2){
//         return n1-n2;
//     }
// }
public class inherit {
    public static void main(String[] args){
        advanceCalc objs = new advanceCalc();
        int r1 = objs.add(7,9);
        int r2 = objs.sub(7,9);
        int r3 = objs.mul(7,9);
        int r4 = objs.div(9,3);
        double r5 = objs.power(2,3);
        
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
