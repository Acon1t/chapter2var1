import java.util.Scanner;
import java.util.HashSet;
public class Task4 {
    ;

    public static void task4() {
        double srednee = 0;
        int lenth = 0;
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        Integer[] num = new Integer[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        int min = diffNum(num[0]);
        int minElem = num[0];

        for (int i = 1; i < num.length; i++) {
            if (diffNum(num[i]) < min) {
                min = diffNum(num[i]);
                minElem = num[i];
            }
        }
        System.out.printf("Elem: %d", minElem);
    }

    private static int diffNum(int x) {
        HashSet<Integer> nums = new HashSet<>();
        while (x > 0) {
            nums.add(x % 10);
            x /= 10;
        }
        return nums.size();
    }
    }
