package stack;

import java.util.Stack;

public class valid {
    public static void main(String[] args){
        String str ="(()(())()()()";
        Stack <Character> st = new Stack<Character>();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    count++;
                }
                else if(st.peek()=='('){
                    st.pop();
                }else{
                    count++;
                }
            }
        }
        if(count==0  && st.isEmpty()){
        System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }
}
