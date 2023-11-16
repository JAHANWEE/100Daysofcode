package basic;

import java.util.Scanner;

public class sum_of_n {
     public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum=0;
        int i=0;
        while( i <=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
