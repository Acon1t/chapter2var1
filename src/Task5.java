import java.util.ArrayList;
import java.util.Scanner;
public class Task5 {
    public static void task5() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        Integer[] num = new Integer[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        int ch_kol = 0;
        int nch_kol = 0;
        int chet = 0;
        int nechet = 0;
        for (int s = 0; s < numbers; s++) {
            ArrayList<Integer> chislo = new ArrayList<>();
            while (num[s] != 0) {
                chislo.add(num[s] % 10);
                num[s] /= 10;
            }
            for (int i = 0; i < chislo.size(); i++) {
                if (chislo.get(i) % 2 == 0){
                    ch_kol++;
                }
                else {
                    nch_kol++;
                }
            }
            if (ch_kol == chislo.size()) {
                chet++;
            }
            else if (ch_kol == nch_kol) {
                nechet++;
            }
            ch_kol = 0;
            nch_kol = 0;
        }
        System.out.println("Количество чисел состоящих только из четных цифр : " + chet);
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Количество чисел, где количество четных и нечетных цифр равно : " + nechet);
    }
}
