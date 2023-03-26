import java.util.Scanner;
public class Task9 {
    public static void task9() {
        double a, b, c;
        double D;
        Scanner scan = new Scanner(System.in);
        System.out.println("Еnter a, b и c:");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("no roots!");
        }
    }
}

