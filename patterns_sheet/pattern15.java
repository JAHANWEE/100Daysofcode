
    import java.util.*;
    public class pattern15
    {
        public static void main(String[] args) {
               Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            for( int i=0;i<n;i++){
                for(int j=1;j<2*i;j++){
                    System.out.print("\t");
                }
                for(int j=n;j>i;j--){
                    System.out.print("*\t");
                }
              System.out.println();
            }
            for( int i=n-2;i>=0;i--){
                for(int j=1;j<2*i;j++){
                    System.out.print("\t");
                }
                for(int j=n;j>i;j--){
                    System.out.print("*\t");
                }
              System.out.println();
            }
        }
    }
    
    
    
    