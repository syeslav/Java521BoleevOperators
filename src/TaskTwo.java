import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        //Todo: Напишите программу, которая проверяет, является ли введенное пользователем число четным или нечетным.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " - четное.");
        } else
            System.out.println("Число " + number + " - нечетное.");

    }
}
