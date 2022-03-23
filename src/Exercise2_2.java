import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество минут:");
        int minutes = scanner.nextInt();
        int years = minutes / (60 * 24 * 365);
        int days = minutes % (60 * 24 * 365) / (60 * 24);
        System.out.println(minutes + " минут это:");
        System.out.println(years + " года(лет)");
        System.out.println(days + " дней");
    }
}
