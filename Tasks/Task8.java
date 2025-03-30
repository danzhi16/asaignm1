package Tasks;

import java.util.Scanner;

public class Task8 {
    // Time Complexity: O(n) - Check each character
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (isAllDigits(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}