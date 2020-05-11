import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int d;

        Scanner number = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = number.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int b = number2.nextInt();

        Scanner deystv = new Scanner(System.in);
        System.out.println("Введите номер действия");
        System.out.println("1) + ");
        System.out.println("2) - ");
        System.out.println("3) * ");
        System.out.println("4) / ");
        int c = deystv.nextInt();

        switch (c) {
            case (1):
                d = a + b;
                break;
            case (2):
                d = a - b;
                break;
            case (3):
                d = a * b;
                break;
            case (4):
                d = a / b;
                break;
            default:
                System.out.println("Введите НОМЕР действия");
                return;
        }

        System.out.println("Ответ: " +d);
    }
}
