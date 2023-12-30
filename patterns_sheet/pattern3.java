import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row =1;
        int space = 0;
        int star = n;

        while(row<=n){
            //star
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            //space
            int j =1;
            while(j<space){
                System.out.print(" ");
                j++;
            }

            row++;
            System.out.println();
            star--;
            space++;
        }
    }
}
