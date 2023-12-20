package array;

public class max_of_arr {
    public static void main(String []args){
        int[] arr= {10 , -1, 3 , -7};
        int r =max(arr);
        System.out.println(r);
    }
    public static  int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
            max=arr[i];
          }
        }
        return max;
    }
}
