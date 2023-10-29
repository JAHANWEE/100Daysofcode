package stringss;

import java.util.Scanner;

public class sunstrin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //substring does  not take the last index of string which is specified
        String str = scn.nextLine();
        String ab = str.substring(0,1);
                // String ab = str.substring(3,1); not acceptable

        System.out.println(ab);
        System.out.println(str.substring(2));
    }
}
