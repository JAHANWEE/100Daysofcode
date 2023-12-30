import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1;
        int star=n;
        while(row<=n){
            int nst =1;
            while(nst<=star){
                System.out.print("* ");
                nst++;
            }
            System.out.println();
            row++;
        }
    }
}
