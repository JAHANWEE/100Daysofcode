package algoprep;

import java.util.Scanner;

public class isprime {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
