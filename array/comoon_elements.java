package array;

import java.util.Scanner;

public class comoon_elements {
     public static void main(String []args){
        int[] arr1 = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        int[] arr2 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 };
        int a = arr1.length;
        int b =arr2.length;
        
        int []ans = new int[a*b];
        int count=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(arr1[i]==arr2[j]){
                    ans[count]=arr1[i];
                    count++;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
     }
}
