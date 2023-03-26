import java.util.Scanner;

public class Task3 {
    ;

    public static void task3() {
        double srednee=0;
        int lenth=0;
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        Integer[] num = new Integer[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++) {
            lenth=String.valueOf(num[i]).length();
            srednee=srednee+lenth;
        }
        srednee=srednee/numbers;
        System.out.println("\\\\\\\\\\");
        for ( int i = 0; i < numbers; i++ ){
            lenth=0;
            lenth=String.valueOf(num[i]).length();
            if (lenth>srednee) {
                System.out.println(num[i] + " " + lenth);
            }
    }
    }
}
