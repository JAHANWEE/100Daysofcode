package project;

import java.util.Scanner;
import java.util.Random;
public class user {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        int n1=0;
        int n2=0;
        int opNum =0;
        String op="";
        int userAnswer=0;
        int correctAnswer=0;
        int score=0;
        int totalQues =0;
        //input
        System.out.println("Enter your name");
        String userName =scn.nextLine();
        //customized greeting for user
        greet(userName);

        while(totalQues<5){
            n1=random.nextInt(10)+1;
            n2=random.nextInt(10)+1;
            opNum=random.nextInt(4)+1;
            //to choose operator
            op=chooseOperator(opNum);
            //print question
            printQuestion(n1, n2, op);
            //ask user for answer
            System.out.print("Ans : ");
            userAnswer=scn.nextInt();
            //calculate the answer
            correctAnswer=calculateAnswer(n1,n2,op);
            //check if answer is correct
            if(userAnswer==correctAnswer){
                System.out.println("Hurray , Correct Answer.");
                score=score+1;
            }else{
                System.out.println("Oops , Try better next time ");
                System.out.println("The correct answer is : "+correctAnswer);
            }
            totalQues+=1;
        }
        scored(score, userName);
    }
    public static void greet(String userName){
        System.out.println("Hy "+userName+" , Welcome to the Quiz ");
    }
    public static void scored(int score , String userName){
        System.out.println("Congratulations!");
        System.out.println("Hey "+userName+", Your score is "+score);
        
    }
    public static void printQuestion(int n1, int n2, String op){
        System.out.println("What is " + n1 + op + n2 + "?");
    }
    public static String chooseOperator(int opNum){
        if(opNum==1){
            return "+";
        }else if(opNum==2){
            return "-";
        }else if(opNum==3){
            return "*";
        }else{
            return "/";
        }
    }
    public static int calculateAnswer(int n1, int n2,String op){
        if(op=="-"){
            return n1-n2;
        }else if(op == "+"){
            return n1+n2;
        }else if(op == "*"){
            return n1*n2;
        }else if( op == "/"){
            return n1/n2;
        }else{
            return -1;
        }
    }
}
