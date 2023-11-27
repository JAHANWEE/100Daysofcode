package stringss;

public class compress {
    public static void main(String[] args) {
        String str = "wwwwaaadexxxxxx";
        char ch=str.charAt(0);
        int count=0;
        System.out.println(ch);
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i+1)==ch){
                count++;
            }else{
                System.out.print(count);
                count=1;
                System.out.print(str.charAt(i));
            }
        }

    }
}
