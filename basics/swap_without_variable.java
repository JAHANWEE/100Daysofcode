import java.util.Scanner;

public class swap_without_variable {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();   //20---->chai
    int b = scn.nextInt();   //30---->coffee
    a=a+b; //50
    b =a-b; //20
    a=a-b; //30
    System.out.println(a);
    System.out.println(b);
    }
    
}
