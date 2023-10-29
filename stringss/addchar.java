package stringss;

import java.util.*;
public class addchar {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         String s1="hello";
         s1+=' ';
         s1 += 'w';
         s1+=10;
        // System.out.println(s1);
        // System.out.println(s1+10+20);
        // System.out.println(10+20+s1);  //30hello w10


        //string.split
        String s2 ="abc def ghi";
        String[] parts =s2.split(" "); //seperated using spaces
        for(int i=0;i<parts.length;i++){
        System.out.println(parts[i]);
        }
    }
}