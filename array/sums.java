package array;

public class sums {
    public static void main(String [] args){
        int[] arr= {10,-1,3,-7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
