package pattern;

import java.util.Scanner;

public class pattern9 {
     public static void main(String[] args){
     Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst=1;
        int nsp=n-1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
// output:
// 5
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
