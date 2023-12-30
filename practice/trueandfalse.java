/*
Problem  luchtime 17 th july 2022:

Alice wrote an exam containing NN true or false questions (i.e. questions whose answer is either true or false). Each question is worth 11 mark and there is no negative marking in the examination. Alice scored KK marks out of NN.

Bob wrote the same exam but he marked each and every question as the opposite of what Alice did, i.e, for whichever questions Alice marked true, Bob marked false and for whichever questions Alice marked false, Bob marked true.

Determine the score of Bob.

  
 
 

Link: https://www.codechef.com/submit/TFPAPER
 
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
		    
		    
		        System.out.println(a-b);
		    
		}
	}
}
