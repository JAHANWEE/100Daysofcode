/* Online Java Compiler and Editor */
import java.util.*;
public class primenumber{

     public static void main(String []args){
       Scanner scn = new Scanner(System.in);
            int t =scn.nextInt();
            while(t-->0){
                int count=0;
                int n = scn.nextInt();
                for(int i=2;i*i<=n;i++){
                    if(n%i==0){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.println("Prime");
                }else{
                    System.out.println("Non-prime");
                }
            }
     }
}