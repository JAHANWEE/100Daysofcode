/*Problem
Chef and his girlfriend go on a date. 
Chef took XX dollars with him, and was quite sure that this would be enough to pay the bill. 
At the end, the waiter brought a bill of YY dollars. 
Print "YES" if Chef has enough money to pay the bill, or "NO" if he has to borrow from his girlfriend and leave a bad impression on her. 

link:https://www.codechef.com/submit/CHEFONDATE?tab=statement
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
		int t = scn.nextInt();
		
		while(t>0){
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    
		    if(a==b || a>b){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    t--;
		}
		
	}
}
