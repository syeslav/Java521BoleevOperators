import java.math.BigInteger;
import java.util.Scanner;

//Todo: Напишите программу, которая проверяет, является ли число, введенное пользователем, простым.

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Ошибка");
            System.exit(0);
        }

        Integer integer = num;
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));

        if (probablePrime == true) {
            System.out.println("Число - " + num + " простое");
        } else
            System.out.println("Число - " + num + " сложное");
    }
}

