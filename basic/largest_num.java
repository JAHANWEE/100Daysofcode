package basic;

import java.util.Scanner;

public class largest_num {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int maxValue = Integer.MIN_VALUE;

        for(int i=1;i<=n;i++){
            int current = scn.nextInt();
             maxValue = Math.max(maxValue , current);
        }
        System.out.println(maxValue);
    }
}
