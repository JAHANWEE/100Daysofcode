package pattern;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(nst+" ");
            }
            nst++;
            System.out.println();
        }
    }
}
// output:
// 3
// 1 
// 2 2 
// 3 3 3 
