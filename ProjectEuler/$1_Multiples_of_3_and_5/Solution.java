package $1_Multiples_of_3_and_5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long i = 0;i < t;i++) {
            long n = in.nextLong();
            long sum3 = 0, sum5 = 0, minus15 = 0;
            sum3 = (n - 1 - ((n - 1) % 3)) / 3;
            sum5 = (n - 1 - ((n - 1) % 5)) / 5;
            minus15 = (n - 1 - ((n - 1) % 15)) / 15;
            long c= 3 * sum3 * (sum3 + 1) / 2 + 5 * sum5 * (sum5 + 1) / 2 - 15 * minus15 * (minus15 + 1) / 2;
            System.out.println(c);
        }
    }
}