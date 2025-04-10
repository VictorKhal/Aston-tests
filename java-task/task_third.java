public class task_third {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Все четные числа заданного массива: ");

        for (int num : numbers) { // можно также реализовать по перебору индексов
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
