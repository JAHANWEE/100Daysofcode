package stringss;

import java.util.Scanner;

public class substrings {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        for(int i=0;i<=str.length()-1;i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
     }
}
