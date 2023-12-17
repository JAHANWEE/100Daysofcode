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
        calc objs = new calc();
        int r1 = objs.add(7,9);
        int r2 = objs.sub(7,9);

        System.out.println(r1+" "+r2);
    }
}
