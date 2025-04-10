import java.util.Scanner;

public class task_second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку a: ");
        String a = scan.next();

        System.out.println("Введите строку b: ");
        String b = scan.next();
        scan.close();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }

    }
}
