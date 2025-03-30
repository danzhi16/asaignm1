package Tasks;

import java.util.Scanner;

public class Task4 {
    // Time Complexity: O(n) - Linear recursion
    public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFactorial(n));
    }
}