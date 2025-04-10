import java.util.Scanner;

public class task {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0;

        try {
            System.out.println("Введите целое число a: ");
            a = scan.nextInt();

            System.out.println("Введите целое число b: ");
            b = scan.nextInt();
            scan.nextLine();
        }
        catch (Exception e) {
            System.out.println("Введено неверное значение");
            scan.close();
            return;
        }
 
        scan.close();

        compare(a, b);
        System.out.println();
        calculation(a, b);
    }

    public static void compare(int a, int b) {
        if (a == b) {
            System.out.println("Значения равны a = b: " + a + " = " + b);
        } 
        if (a > b) {
            System.out.println("Значения a > b: " + a + " > " + b);
        }
        if (a < b) {
            System.out.println("Значения a < b: " + a + " < " + b);
        }
    }

    public static void calculation(int a, int b) {
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));

        if (b != 0) {
            System.out.println("Частное: " + ((double) a / b));
        } else {
            System.out.println("Дельить на ноль нельзя!");
        }
    }
}