package oops;

public class twod {
    public static void main(String[] args){
        int [][] arr = new int[3][4]; // 3 arrys with size 4 or 3 rows and 4 columns
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=(int)(Math.random()*100); // gives random value to fil in arrays.
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
