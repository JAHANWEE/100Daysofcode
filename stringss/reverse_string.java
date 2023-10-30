package stringss;

public class reverse_string {
    public static void main(String[] arg){
        String s1="nitin";
        for(int i=s1.length()-1;i>=0;i--){
            char ch=s1.charAt(i);
            System.out.print(ch);
        }
    }
}
