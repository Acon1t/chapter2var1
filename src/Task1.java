import java.util.Scanner;

public class Task1 {
    public static void task1() {
        int minLength=1000;
        int maxLength=-10;
        int min=0;
        int max=0;
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++){
            int length = String.valueOf(num[i]).length();
            if (length < minLength) {
                min=num[i];
                minLength=length;
            }
            else if (length > maxLength) {
                max=num[i];
                maxLength=length;
            }
        }
        System.out.println("Minimum number:" + min +" length" +minLength);
        System.out.println("Maximum number:" + max +" length" +maxLength);
    }
}

