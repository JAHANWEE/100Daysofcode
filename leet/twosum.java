
package leet;
import java.util.*;
public class twosum {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int[] nums = new int[n];
         for(int i=0;i<nums.length;i++){
            nums[i]=scn.nextInt();
         }
         int target = scn.nextInt();
         int []result =twoSum(nums, target);
         System.out.print("[");
         for(int i=0;i<result.length;i++){
            System.out.print(i+",");
         }
         System.out.println("]");
    }
    public static int[] twoSum(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length-1;j++){
                    if(nums[i]+nums[j]==target){
                        return new int[] {i , j};
                    }
                }
            }
            return new int[]{};
    }

}
