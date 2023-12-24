package array;

import java.util.Scanner;

public class rotate {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        int k =scn.nextInt();
        reverses(arr , 0 , n-1);
        reverses(arr, 0,k-1);
        reverses(arr,k, n-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void  reverses(int [] arr , int s , int e){
        int i =s ;
        int j = e;

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;

            i++;
            j--;
        }
    }
}
