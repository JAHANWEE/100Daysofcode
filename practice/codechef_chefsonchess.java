/* 
Problem
Chef has recently started playing chess, and wants to play as many games as possible.

He calculated that playing one game of chess takes at least 2020 minutes of his time.

Chef has NN hours of free time. What is the maximum number of complete chess games he can play in that time?

link:https://www.codechef.com/submit/CHESSTIME

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
	        int n = scn.nextInt();
	        int time = n*60;
	       int ans =  time / 20 ;
	       System.out.println(ans);
	        t--;
	    }
	}
}
