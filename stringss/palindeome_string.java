package stringss;

public class palindeome_string {
    public static void main(String[]args){
        String s1="singh";
        int i=0;
        int j=s1.length()-1;
        int count=0;
        while(i<=j){
            if(s1.charAt(i)!=s1.charAt(j)){
                count++;
                break;
            }
                i++;
                j--;
        }
        if(count==0){
        System.out.println("trueee");
        }else{
            System.out.println("fausle");
        }
    }
}
