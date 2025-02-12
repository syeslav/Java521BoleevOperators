import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        //Todo: Напишите программу, которая определяет сезон года на основе месяца, введенного пользователем.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();

        if (month > 12) {
            System.out.println("Ошибка");
            System.exit(0);
        }

        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима️";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Неизвестный сезон";
        }

        System.out.println("Этот месяц относится к сезону: " + season);
        scanner.close();
    }
}