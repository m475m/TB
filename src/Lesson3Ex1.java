import java.util.Scanner;

public class Lesson3Ex1 {

    static Integer num;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        num = scanner.nextInt();

        if (!isPositive(num)) System.out.println("Число не является положительным");
        else {
            System.out.println("Число является положительным");
        }
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }
}
