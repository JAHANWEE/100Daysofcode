package array;

public class rever_a_part {
    public static void main(String []args){
        int arr[]={-3,4,2,8,3,9,6,2,8,10};
        int s =3;
        int e =7;
        reverses(arr , s , e);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverses(int[]arr , int s , int e){
        int i=s;
        int j=e;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
}
