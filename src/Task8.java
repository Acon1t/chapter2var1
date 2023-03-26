import java.util.Scanner;

public class Task8 {
    public static void task8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and press <Enter>:");
        int n = sc.nextInt();
        String palindromes = null;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            String s1 = Integer.toString(a[i]);
            if (s1.length() > 1 && isPalindrome(s1)) {
                palindromes = (s1 + " ");
            }
        }

        if (palindromes != null) {
            System.out.println(palindromes);
        } else {
            System.out.println("no palindroms");
        }
    }

    static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }

        }
        return true;
    }
}