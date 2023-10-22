import java.util.*;
public class inverse{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int count=1;
        int ans =0;
        while(n>0){
            int d = n%10;
            int id = count;
            int od = d;
            ans=ans+id*(int)Math.pow(10,od-1);
            n=n/10;
            count++;
        }
        System.out.println(ans);
    }
}
