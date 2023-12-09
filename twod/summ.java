package twod;

import java.util.Scanner;

public class summ {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int arr[][]= new int[m][n];
        int arr1[][]= new int[m][n];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= scn.nextInt();
            }
        }

         for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j]= scn.nextInt();
            }
        }

        int c[][] = new int[m][n];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                c[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

        // 11 22 33 
        // 44 55 66 
    }
}
