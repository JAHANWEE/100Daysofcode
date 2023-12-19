package basic;

import java.util.Scanner;

public class factor {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r1=factorsum(n);
        System.out.println(r1);
    }
    public static int factorsum(int n ){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
}
