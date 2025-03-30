package Tasks;

import java.util.Scanner;

public class Task9 {
    // Time Complexity: O(2^n) - Exponential recursion
    public static int findBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return findBinomial(n - 1, k - 1) + findBinomial(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findBinomial(n, k));
    }
}