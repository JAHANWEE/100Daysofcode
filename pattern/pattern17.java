package pattern;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst =n/2+1;
        int nsp=1;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            if(i<=n/2){
            nst--;;
            nsp+=2;
            }else{
                nsp-=2;
                nst++;
            }
            
            System.out.println();
        }
    }
}
// output:
// 5
// * * *   * * * 
// * *       * * 
// *           * 
// * *       * * 
// * * *   * * * 
