/*
Problem
There are only 22 type of denominations in Chefland:

Coins worth 11 rupee each
Notes worth 1010 rupees each
Chef wants to pay his friend exactly XX rupees. What is the minimum number of coins Chef needs to pay exactly XX rupees?

link:https://www.codechef.com/submit/MINCOINSREQ
  
 
 */

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		while(t>0){
		    int n = scn.nextInt();
		   n= n%10 ;
		   System.out.println(n);
		    t--;
		}
		
	}
}
