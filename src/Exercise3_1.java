import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите текст");
        String str = scanner.nextLine();
        System.out.println("введите индекс:");
        int index = scanner.nextInt();
        System.out.println(str.charAt(index));
    }
}
