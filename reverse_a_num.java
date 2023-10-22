import java.util.*;
public class reverse_a_num {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n>0){
            int a = n%10;
            System.out.println(a);
            n=n/10;
            
        }
    }
}
