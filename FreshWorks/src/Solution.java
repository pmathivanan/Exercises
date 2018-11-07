import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {

    /*
     * Complete the 'consecutive' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER num as parameter.
     */

    public static int consecutive(long num) {
    // Write your code here
    	List<Long> numList = new ArrayList<Long>();
    	int count=0;
    	for(long i=0;i<=num;i++) {
    		numList.add(i);	
    	}
    	for(long j:numList) {
    		long sum=0;
    		for(long k:numList) {
    			if(sum < num)
    				sum+=k;
    			if(sum > num)
    				break;
    			if(sum==num) {
    				count++;
    				break;
    			}
    		}
    	}return count;
    }
}
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Sangeetha\\Desktop\\hacker.txt"));

            long num = Long.parseLong(bufferedReader.readLine().trim());

            int result = Result.consecutive(num);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }