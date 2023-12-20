package function;

public class digit_frequency {
    public static void main(String[] args){
        int n = 994543234;
        int d=4;
        int r =count(n , d);
        System.out.println(r);
    }
    public static int count(int n , int d){
        int count=0;
        while(n>0){
            int r = n%10;
            if(r==d){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}
//https://pepcoding.com/resources/online-java-foundation/function-and-arrays/digit-frequency-official/ojquestion