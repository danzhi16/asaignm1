package Tasks;

import java.util.Scanner;

public class Task10 {
    // Time Complexity: O(log(min(a, b))) - Euclidean Algorithm
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGCD(a, b));
    }
}