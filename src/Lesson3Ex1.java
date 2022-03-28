import java.util.Scanner;

public class Lesson3Ex1 {

    static Integer num;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Число является положительным");
        } else {
            System.out.println("Число не является положительным");
        }
    }
}
