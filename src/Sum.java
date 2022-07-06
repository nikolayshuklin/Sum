import java.text.DecimalFormat;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа расчета суммы трех чисел:");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double c = scanner.nextDouble();
        scanner.close();
        DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        System.out.println("Сумма чисел = " + decimalFormat.format(sum(a, b, c)));

    }
    static double sum (double a, double b, double c){
        return a + b + c;
    }

}
