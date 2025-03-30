package Tasks;

import java.util.Scanner;

public class Task6 {
    // Time Complexity: O(n) - Linear recursion
    public static int findPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * findPower(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findPower(a, n));
    }
}