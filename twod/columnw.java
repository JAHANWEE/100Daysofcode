package twod;

import java.util.Scanner;

public class columnw {
   
    public static void main(String []args){
     
     
     int[][]arr = {
        {10 , 20 , 30 , 40},
        {50 , 60 , 70 , 80},
        {90, 100 , 110 , 120},
    };
     
      for(int j=0;j<arr[0].length;j++){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
}
