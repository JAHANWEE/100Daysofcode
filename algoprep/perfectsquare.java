package algoprep;

import java.util.Scanner;

public class perfectsquare {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                count++;
            }
        }
        if(count!=0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
        
    }
}
