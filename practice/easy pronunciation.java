/*
Problem:
Words that contain many consecutive consonants, like "schtschurowskia", are generally considered somewhat hard to pronounce.

We say that a word is hard to pronounce if it contains 44 or more consonants in a row; otherwise it is easy to pronounce. For example, "apple" and "polish" are easy to pronounce, but "schtschurowskia" is hard to pronounce.

You are given a string SS consisting of NN lowercase Latin characters. Determine whether it is easy to pronounce or not based on the rule above — print YES if it is easy to pronounce and NO otherwise.

For the purposes of this problem, the vowels are the characters \{a, e, i, o, u\}{a,e,i,o,u} and the consonants are the other 2121 characters.


Link: https://www.codechef.com/submit/EZSPEAK?tab=statement
 
 */


/* package codechef; // don't place package name! */

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
		    int n = scn.nextInt();
		    String s = scn.next();
		    int i=0;
		    int f = 1;
		    while(i+3 < n){
		        if(charactercheck(s.charAt(i),s.charAt(i+1),s.charAt(i+2),s.charAt(i+3) ) == true ){
		            System.out.println("No");
		            f=0;
		            break;
		        }
		        i++;
		    }
		    if(f==1){
		        System.out.println("Yes");
		    }
		t--;    
		}
	}
	
	static boolean charactercheck(char a, char b, char c, char d){
	    if(concatcon(a) && concatcon(b) && concatcon(c) && concatcon(d)){
	        return true;
	    }else {
	        return false;
	    }
	}
	
	static boolean concatcon(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            return false;
        else
            return true;
	}
}
            
            
		


