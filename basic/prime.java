package basic;

import java.util.Scanner;

public class prime {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        prime(n);
       
    }
    public static void  prime(int n){
        int div=2;
        int count=0;
        while(div*div<=n-1){
            if(n%div==0){
               count++;
                break;
                
            }
            div++;
        }
        if(count==0){
        System.out.println("Prime");
        }else{
            System.out.println("Non-prime");
        }
        
    }
}
