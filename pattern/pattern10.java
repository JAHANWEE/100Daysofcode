package pattern;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args){
     Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst=n*2-1;
        int nsp=0;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
// output:
// 5
// * * * * * * * * * 
//   * * * * * * * 
//     * * * * * 
//       * * * 
//         * 