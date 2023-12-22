package array;

public class reverses {
    public static void main(String []args){
        int arr[]= {10,20,30,40,50};
        int ans[] =swaps(arr);
        for(int i=0;i<ans.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
    public static int[] swaps(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
        return arr;
    }
}
