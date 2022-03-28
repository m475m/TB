import java.util.Arrays;
import java.util.Scanner;

public class Lesson3Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 цифры разделяя их пробелом");
        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        Arrays.parallelSort(arr);

        System.out.print(arr[2]);
        System.out.print(arr[1]);
        System.out.print(arr[0]);

    }


}
