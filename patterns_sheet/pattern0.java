import java.util.Scanner;

public class pattern0{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while(i<=n){
            System.out.print("* ");
            i++;
        }
    }
}