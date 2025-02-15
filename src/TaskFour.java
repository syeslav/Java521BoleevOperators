import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        // Todo: Напишите программу, которая выводит таблицу умножения для числа, введенного пользователем.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);

        }

    }

}
