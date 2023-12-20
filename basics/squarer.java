import java.util.Scanner;

public class squarer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = (int)Math.floor(sqrtt(n));
        System.out.println(ans);
    }
    public static int sqrtt(int n ){
        int ans =1;
        int i=1;
        while(i*i<=n){
            ans=i;
            i++;
        }
        return ans;
    }
}
