package twod;

import java.util.Scanner;

public class columnw {
   
    public static void main(String []args){
     
     
     int[][]arr = {
        {10 , 20 , 30 , 40},
        {50 , 60 , 70 , 80},
        {90, 100 , 110 , 120},
    };
     
      for(int i=0;i<arr[0].length;i++){  //4
        for(int j=0;j<arr.length;j++){  //3
            System.out.print(arr[j][i]+" ");   
            // 0,0  0,1 0,2 0,3     
            // 1,0  1,1 1,2 1,3   
            // 2,0  2,1 2,2 2,3
        }
        System.out.println();
      }
    }
}
