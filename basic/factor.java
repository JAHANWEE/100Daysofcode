package basic;

import java.util.Scanner;

public class factor {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r1=factorsum(n);
        System.out.println(r1);

        int r2=betterfactorsum(n);
        System.out.println(r2);

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
    public static int betterfactorsum(int n){
     int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i!=n/i){
                    count+=2;
                }else{
                count++;
                }
            }
        }
        return count;
    }
}
