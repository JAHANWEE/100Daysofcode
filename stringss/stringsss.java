package stringss;

import java.util.*;
public class stringsss {
  public static void main(String[]args){
  String s1="house";
  String s2="maouse";
  String s3="khause";
  s1="ello";
  s2="ello";
  for(int i=0;i<s3.length();i++){
    char ch =s3.charAt(i);
    System.out.println(ch);
  }
//   s1="mello";
//   if(s2.equals(s3)){
//    System.out.println("true");
//   }else{
//     System.out.println("false");
//   }
//   if(s1==s2){
//        System.out.println("true");
//   }else{
//     System.out.println("false");
//   }
System.out.println(s3.length());
System.out.println(s3.toUpperCase());
System.out.println(s1+s2);
System.out.println(s1.indexOf("o"));
System.out.println(s3.substring(2,6));
  }
}
