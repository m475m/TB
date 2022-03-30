import java.util.Scanner;

public class Lesson3Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели [ПН, ВТ, СР, ЧТ, ПТ, СБ, ВС]:");
        String day = scanner.next();

        switch (day.toUpperCase()) {
            case "ПН":
                System.out.println("Рабочий");
                return;
            case "ВТ":
                System.out.println("Рабочий");
                return;
            case "СР":
                System.out.println("Рабочий");
                return;
            case "ЧТ":
                System.out.println("Рабочий");
                return;
            case "ПТ":
                System.out.println("Рабочий");
                return;
            case "СБ":
                System.out.println("Выходной");
                return;
            case "ВС":
                System.out.println("Выходной");
                return;
            default:
                System.out.println("День недели указан неверно");
        }

    }
}
