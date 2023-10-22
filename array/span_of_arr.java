package array;
import java.util.*;
public class span_of_arr {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int low =arr[0];
        int high =arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<low){
                low=arr[i];
            }else if(arr[i]>high){
                high = arr[i];
            }
        }
        System.out.println(high-low);
    }
}
