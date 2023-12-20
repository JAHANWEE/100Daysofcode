package basic;

import java.util.Scanner;

import oops.staticm;

public class sum_of_n {
     public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r1=sums(n);
        System.out.println(r1);
        advsums(n);
     }

     public static int sums(int n){
        int sum=0;
        int i=0;
        while( i <=n){
            sum+=i;
            i++;
        }
        return sum;
    }

    public static void advsums(int n){
    //   s=n*(n+1)/2 is the sum of n natural numbers

    }
    
}
