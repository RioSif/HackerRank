package $1_Multiples_of_3_and_5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){
            int sum = 0;
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                sum = (i % 3 == 0 ||  i % 5 == 0 ? sum + i : sum );
            }
            System.out.println(sum);
        }

    }
}