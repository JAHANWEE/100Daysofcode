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
        while(div*div<=n-1){
            if(n%div==0){
                System.out.println("Non-Prime");
                break;
            }
            div++;
        }
        System.out.println("Prime");
    }
}
