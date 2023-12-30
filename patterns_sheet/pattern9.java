import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1;
        int space = n-1;
        int star=1;
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
            space--;
            System.out.println();
            star+=2;
            row++;
        }
    }

}
