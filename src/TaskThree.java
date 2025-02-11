import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        //Todo: Напишите программу, которая вычисляет факториал числа, введенного пользователем.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int factorial = scanner.nextInt();

        System.out.println(getFactorial(factorial));
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}

