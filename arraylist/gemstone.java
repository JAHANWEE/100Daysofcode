package arraylist;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
public class gemstone {

    public static void main(String[] args)  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String arrItem = bufferedReader.readLine();
            arr.add(arrItem);
        }

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static int gemstones(List<String> arr) {
        return 0;
        // Write your code here
        for(int i=0;i<arr.length();i++){
            arr.get(0);
        }
        for(int )
    }
}


