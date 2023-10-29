package stringss;

// differnce between .next and .nextLine
//.next reads only till the space
//.nextLine reads the whole lin including multiple spaces.

import java.util.*;
public class nexts{
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s2 =scn.nextLine();
        // String s1=scn.next();
        // System.out.println(s1);
        System.out.println(s2.length());

        char ch=s2.charAt(3);
        System.out.println(ch);

        for(int i=1;i<s2.length();i++){
            char a = s2.charAt(i);
            System.out.print(a);
        }

    }
}