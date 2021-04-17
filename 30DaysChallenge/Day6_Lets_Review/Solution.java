package Day6_Lets_Review;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String S = sc.nextLine();
            String Seven = "";
            String Sodd = "";

            for (int j = 0; j < S.length(); j += 2) {
                Seven += S.charAt(j);
                if (j + 1 < S.length()) {
                    Sodd += S.charAt(j + 1);
                }
            }

            System.out.printf("%s %s\n", Seven, Sodd);
        }
    }
}