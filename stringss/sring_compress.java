package stringss;

public class sring_compress {
    public static void main(String[] arg){
       String s1="wwwwaaadexxxxxx";
       compression(s1);
       System.out.println();
       compression_two(s1);
    }
    public static void compression(String s1){
    System.out.print(s1.charAt(0));
        for(int i=1;i<s1.length()-1;i++){
            if(s1.charAt(i)!=s1.charAt(i-1)){
                System.out.print(s1.charAt(i));
            }
            
        }
    }
    public static void compression_two(String s1){
        int count=1;
        System.out.print(s1.charAt(0));
        for(int i=1;i<s1.length();i++){
            if(s1.charAt(i)==s1.charAt(i-1)){
                count++;
            }else{
                if(count!=1){
                    System.out.print(count);
                }
                System.out.print(s1.charAt(i));
                count=1;
            }
            
        }
        System.out.print(count);
    }
}
