import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1;
        int star=1;
        int space =2*n-3;
        while(row<=n){
            //star
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            //star
            int k=1;
            if(row==n){
                k=2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            //next step

            System.out.println();
            row++;
            space-=2;
            star++;
        }
    }
}
