package pattern;

import java.util.Scanner;

public class patttern18 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst =1;
        int nsp =n/2;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
           
           if(i<=n/2){
            nst+=2;
            nsp--;
           }else{
            nst-=2;
            nsp++;
           }
            System.out.println();
        }
    }
}
// output:
// 5
//     * 
//   * * * 
// * * * * * 
//   * * * 
//     * 