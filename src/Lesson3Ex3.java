import java.util.Scanner;

public class Lesson3Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if (x == 0) {
            System.out.println("ноль");
        } else {
            if (x > 0) {
                System.out.println("положительный");
            } else {
                System.out.println("отрицательный");
            }
            if (Math.abs(x) > 1_000_000) {
                System.out.println("большой");
            }
            if (Math.abs(x) < 1) {
                System.out.println("маленький");
            }
        }
    }
}
