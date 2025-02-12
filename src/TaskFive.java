import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        //Todo: Напишите программу, которая выводит числа от N до 1 в обратном порядке.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int number = scanner.nextInt();
        int f = number;

        for (int i = 1; i <= number; f++) {
            System.out.println(number--);

        }

    }
}
