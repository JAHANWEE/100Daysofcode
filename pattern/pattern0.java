package pattern;

import java.util.Scanner;

public class pattern0 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst =1;
        int var =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(var+" ");
                var++;
            }
            nst++;
            System.out.println();
        }
    }
}
// output:
// 3
// 1 
// 2 3 
// 4 5 6 
