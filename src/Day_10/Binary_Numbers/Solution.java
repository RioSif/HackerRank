import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String bin = "";
        int sum = 0;
        String aces = "";

        while (n != 0) {
            if (n % 2 == 1) {
                sum++;
            } else {
                aces += sum;
                sum = 0;
            }
            n /= 2;
        }
        aces += sum;

        int max = 0;
        int[] acessum = new int[aces.length()];
        for (int i = 0; i < aces.length() ; i++) {
            if (aces.charAt(i) > max) {
                max = Character.getNumericValue(aces.charAt(i));
            }
        }

        System.out.println(max);

        scanner.close();
    }
}
