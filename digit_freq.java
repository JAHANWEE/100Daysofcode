import java.util.*;
public class digit_freq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int find= scn.nextInt();
        int count=0;
        while(n>0){
            int d = n%10;
            if(find==d){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);
    }
}
