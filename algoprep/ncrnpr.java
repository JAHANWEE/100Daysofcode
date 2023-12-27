package algoprep;

import java.util.Scanner;

public class ncrnpr {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int nfact = fact(n);
        int nprfact = fact(n) / fact(n-r);
        int ncrfact = fact(n)/(fact(r)*fact(n-r));
        System.out.println(nfact);
        System.out.println(nprfact);
        System.out.println(ncrfact);
        
    }
    public static int fact(int n){
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact=nfact*i;
        }
        return nfact;
    }
}
