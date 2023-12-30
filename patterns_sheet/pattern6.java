import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1;
        int space =0;
        int star=n;
        while(row<=n){

            //space
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            //star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            row++;
            System.out.println();
            space+=2;
            star--;
        }
    }

}
