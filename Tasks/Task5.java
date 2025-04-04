package Tasks;

import java.util.Scanner;

public class Task5 {
    // Time Complexity: O(2^n) - Exponential recursion
    public static int findFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFibonacci(n));
    }
}