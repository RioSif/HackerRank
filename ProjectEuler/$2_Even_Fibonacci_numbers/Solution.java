package $2_Even_Fibonacci_numbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long sumeven(long n) {
        // your code
        long result = 0;
        long fSum = Long.MAX_VALUE;
        long fibN0 = 0;
        long fibN = 1;
        long fibN1;

        while (n >= (fibN1 = fibN + fibN0 )) {
            result = fibN1 % 2 == 0 ? result + fibN1 : result;
            fibN0 = fibN;
            fibN = fibN1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(sumeven(n));
        }
    }
}