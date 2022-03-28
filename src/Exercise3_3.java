import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str1 = scanner.nextLine();

        System.out.println("Введите последовательность символов:");
        String str2 = scanner.nextLine();

        if (str1.contains(str2)) {
            System.out.println("Строка содержит заданную последовательность символов");
        } else {
            System.out.println("Строка не содержит заданную последовательность символов");
        }

    }
}
