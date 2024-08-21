package leet;
import java.util.Scanner;
public class firstpalindrome2108 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        String arr[]= new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextLine();
        }
      String ans= firstPalindrome(arr);
      System.out.println(ans);
    }
    public static String firstPalindrome(String[] words){
        String ans="";
           for(int i=0;i<words.length;i++){
            if(ispalindrome(words[i])==true){
               return words[i];
            }
           }
           return ans;
    }
    public static boolean ispalindrome(String arr){
        int i=0;
        int j=arr.length()-1;
        while(i<=j){
            char ch1=arr.charAt(i);
            char ch2=arr.charAt(j);

            if(ch1!=ch2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
