package algoprep;

import java.util.Scanner;

public class rotat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {3 , -2 , 1 , 4 , 6 , 9 ,8};
        int k = scn.nextInt();
        rotated(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotated(int[]arr , int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        //part1
        reverse(arr , 0 , arr.length-k-1);
        //part 2
        reverse(arr ,arr.length-k,arr.length-1 );
        //reverse whole
        reverse(arr , 0 , arr.length-1);
    }
    public static void reverse(int[] arr , int start , int end){
        int s =start;
        int e=end;

        while(s<e){
            int temp =arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}