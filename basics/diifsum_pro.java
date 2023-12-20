import java.util.Scanner;

public class diifsum_pro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int product=product(n);
        int sum=sum(n);
        int ans = product-sum;
        System.out.println(ans);
    }
    public static int product(int n){
        int ans=1;
        while(n>0){
            int r = n%10;
            ans=ans*r;
            n=n/10;
        }
        return ans;
    }
    public static int sum(int n){
        int ans =0;
        while(n>0){
            int r=n%10;
            ans=ans+r;
            n=n/10;
        }
        return ans;
    }
}
