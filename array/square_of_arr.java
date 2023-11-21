package array;
import java.util.*;
public class square_of_arr {
public static void main(String [] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]= scn.nextInt();
    }

    for(int i :arr){
        System.out.println(i*i);
    }

}
}