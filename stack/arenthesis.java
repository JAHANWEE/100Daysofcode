package stack;

import java.util.Stack;

public class arenthesis {
    public static void main(String[] args){
        String str="(((()))()()()";
        Stack <Character> sb = new Stack<>();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('){
                sb.push(ch);
            }else{
                if(sb.isEmpty()){
                    count++;
                }else{
                    sb.pop();
                }
            }
        }
        if(count==0 && sb.isEmpty()){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }

    }
}
