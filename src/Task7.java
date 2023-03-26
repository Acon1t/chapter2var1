import java.util.HashSet;
import java.util.Scanner;

public class Task7 {
    public static void task7() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++) {
            int k=String.valueOf(num[i]).length();
            if (diffNum(num[i])==k) {
                System.out.println(num[i]);
                break;
            }
            if (diffNum(num[i])!=k){
                continue;
            }
        }
    }
    private static int diffNum(int x){
        HashSet<Integer> nums = new HashSet<>();
        while (x>0){
            nums.add(x%10);
            x/=10;
        }
        return nums.size();
    }

}