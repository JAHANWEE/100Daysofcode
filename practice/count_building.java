import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();
    
    long b =1;
    long s =1;
    
    for(int i=2;i<=n;i++){
        long nb = s;
        long ns = s+b;
        
        s=ns;
        b=nb;
    }
    
    long total = s+b;
    total = total* total;
    
    System.out.println(total);
 }

}