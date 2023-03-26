import java.util.Scanner;

public class Task6 {
    public static void task6() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++) {
           if (isGrowing(num[i])==true) {
               System.out.println(num[i]);
               break;
           }
           if (isGrowing(num[i])==false){
               continue;
           }
        }
    }
    private static boolean isGrowing(long n) {

        long last = n % 10;
        n /= 10;
        while(n != 0){
            if (last <= n % 10) return false;
            last = n % 10;
            n /= 10;
        }
        return true;
    }

}