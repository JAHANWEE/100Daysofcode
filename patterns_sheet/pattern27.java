import java.util.*;
public class pattern27 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		   int n=scn.nextInt();
		   int row=1;
           int space=n-1;
           int num=1;
		   while(row<=n) {
			   int i=1;
			   while(i<=space) {
				   System.out.print("   ");
                   i++;
			   }
               int val =1;
			   int j=1;
			   while(j<=num) {
				   System.out.print(val+"  ");
				  if(j>num/2){
                  val--;
                  }
				  else {
                    val++;
                }
				  j++;
			   }
			   num+=2;
               space--;
               row++;
               System.out.println();
		   }

	}
}


