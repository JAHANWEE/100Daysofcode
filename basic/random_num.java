package basic;

import java.util.Scanner;

public class random_num {
    public static void main(String [] args){

        while(true){
           int ans = (int)(Math.random()*10+1); // give a decimL value between 0.0 and 1  , but you want 1-10 spo multiply by 10 so inequality become 0.0 to 10.0 +1
           if(ans==5)
            break;
            if(ans%4==0){    // to skip multiples of 4
                continue;
            }
           System.out.println(ans+" ");
           }
        
    }
}
