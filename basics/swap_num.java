import java.util.*;
public class swap_num {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();   //20---->chai
    int b = scn.nextInt();   //30---->coffee
    int c=0; //glass
    c=a;  //chai to glass
    a=b;  //cofee to chai
    b=c;  //glass to cofee
    
    System.out.println(a);
    System.out.println(b);
    
    
    
  }
}