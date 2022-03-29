import java.util.Scanner;

public class Lesson3Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 цифры разделяя их пробелом");
        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int max_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int tmp = arr[i];
                arr[i] = arr[max_i];
                arr[max_i] = tmp;
            }
        }

        System.out.print(arr[0]);
        System.out.print(arr[1]);
        System.out.print(arr[2]);

    }

}
