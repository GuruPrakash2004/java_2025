import java.io.*;
import java.util.*;
import com.javaaid.String;


 class a1 {
    /*
     * Complete the 'commonChild' function below.
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */
    public static int commonChild(String s1, String s2) {
    // Write your code here
   return LongestCommonSubsequence.LCSM4(s1.toCharArray(),s2.toCharArray(),s1.length(), s2.length());
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = a1.commonChild(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


