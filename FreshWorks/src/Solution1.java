import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {
	
    // Complete the maxDifference function below.
    static int maxDifference(int[] a) {
    	int i=0; int maxDiff=-1000000;
    	while(i<a.length) {
    		if(i==0) {
    			i++;
    			continue;
    		} int j=0;
   			while(j<i)
   			{
   				if(i==1)
   					maxDiff=a[i]-a[j];
   				else if(a[i]>a[j]) {
   					maxDiff=maxDiff<(a[i]-a[j])?(a[i]-a[j]):maxDiff;
   				}
   				j++;
   			}
    		i++;
    	}

    	return maxDiff;
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

        int res = maxDifference(a);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}