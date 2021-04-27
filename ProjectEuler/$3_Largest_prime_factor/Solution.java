package $3_Largest_prime_factor;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            long LPF = 0;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    LPF = i;
                    n /= i;
                }
                if (n < 2) {
                    break;
                }
            }
            System.out.println(LPF);
        }
    }
}