import java.util.Scanner;
public class Task2 {
    ;

    public static void task2() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        Integer[] num = new Integer[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for(int i=1; i<num.length;i++) {
            Integer cur = num[i];
            int j;
            for(j=i-1;j>=0&& String.valueOf(num[j]).length()>String.valueOf(cur).length();j--)
                num[j+1]=num[j];
            num[j+1]=cur;
        }
        System.out.println("\\\\\\\\\\");
        for ( int i = 0; i < numbers; i++ )
            System.out.println(num[i]);
    }
    }


