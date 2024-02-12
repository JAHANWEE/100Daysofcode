package project;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       System.out.println("Enter a number between 0 to 9");
       int n=scn.nextInt();
       int attempt=0;
       int num =RandomNum();
       if(n==num){
        System.out.println(num);
        System.out.println("Wow , You got it correct");
       }else{
        System.out.println("Your answer is "+n);
        System.out.println("The correct answer is "+num);
        System.out.println("Try again!");
       }
    }
    public static int RandomNum(){
        Random random = new Random();
        int n1=random.nextInt(10)+1;
        return n1;
    }
}
