package basic;

import java.util.Scanner;

public class palindrom {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverese = sb.toString();

        if(str.equals(reverese)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
