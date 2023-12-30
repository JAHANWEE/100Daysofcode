/*
 Problem:
Chef is playing a videogame, and is getting close to the end. He decides to finish the rest of the game in a single session.

There are XX levels remaining in the game, and each level takes Chef YY minutes to complete. To protect against eye strain, Chef also decides that every time he completes 33 levels, he will take a ZZ minute break from playing. Note that there is no need to take this break if the game has been completed.

How much time (in minutes) will it take Chef to complete the game?
  
 
link: https://www.codechef.com/submit/LASTLEVELS
 
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
		    t--;
		    
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int c = scn.nextInt();
		    
		    if(a<=3){
		        System.out.println(a*b);
		    }else{
		        int z = a/3;
		        if(a%3==0){
		            int ans = (a*b)+(z-1)*c;
		            System.out.println(ans);
		        }else{
		         int ans =(a*b)+ (z*c);
		        System.out.println(ans);
		        }
		        }
		    }
		}
}
