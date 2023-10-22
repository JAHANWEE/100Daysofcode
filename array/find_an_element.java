package array;
import java.util.*;
public class find_an_element {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]= scn.nextInt();
        }
        int d = scn.nextInt();
        int ans = find_element(arr , d);
        System.out.println(ans);

    }
    public static int find_element(int [] arr , int d){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                return i;
            }
        }
        return -1;
    }
}