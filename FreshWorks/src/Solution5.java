import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution5 {
	
    // Complete the numberOfPairs function below.
    static int numberOfPairs(int[] a, long k) {
        int numberOfPairs=0;int x=0;int y=0;
        Set<Integer> setInteger = new TreeSet<Integer>();
        for(int i:a) {
            setInteger.add(i);
        }
        for (int j:setInteger) {
        	y=x;
            for(int l:setInteger) {
                if((j+l) == k && y>x)
                    numberOfPairs++;
                y++;
            }  
            x++;
        }        
        return numberOfPairs;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Sangeetha\\Desktop\\hacker.txt"));

        int aCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[aCount];

        for (int i = 0; i < aCount; i++) {
            int aItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            a[i] = aItem;
        }

        long k = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int res = numberOfPairs(a, k);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}