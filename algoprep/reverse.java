package algoprep;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String ans="";
        while(n>0){
            int r = n%10;
            ans =ans+r;
            n=n/10;
        }
        System.out.println(ans);
    }
}
