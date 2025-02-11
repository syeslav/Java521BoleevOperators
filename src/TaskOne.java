import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        //Todo:Напишите программу, которая принимает два числа от пользователя и выводит их сумму и среднее значение.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите первое число: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        double average = (double) sum / 2;

        System.out.println(" ");
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее значение: " + average);

    }
}
