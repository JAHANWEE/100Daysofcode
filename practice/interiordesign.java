/*
  Problem:
  Chef decided to redecorate his house, and now needs to decide between two different styles of interior design.

For the first style, tiling the floor will cost X_1X 
1
​
  rupees and painting the walls will cost Y_1Y 
1
​
  rupees.

For the second style, tiling the floor will cost X_2X 
2
​
  rupees and painting the walls will cost Y_2Y 
2
​
  rupees.

Chef will choose whichever style has the lower total cost. How much will Chef pay for his interior design?
 
 

link: https://www.codechef.com/submit/INTRDSGN

 */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t= scn.nextInt();
		
		while(t>0){
		    t--;
		    
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int c = scn.nextInt();
		    int d = scn.nextInt();
		    
		    
		   if(a+b < c+d){
		       System.out.println(a+b);
		   }else{
		       System.out.println(c+d);
		   }
		}
	}
}
