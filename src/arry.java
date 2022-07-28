import java.util.Arrays;

public class arry {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray () ;
        //Задача 1
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
                sum += arr[i];
            }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");



        //Задача 2
        int maxSum = arr[0];
        int minSum = arr[0];
        for (final int arrySum : arr) {
            if (arrySum > maxSum) {
                maxSum = arrySum;
            }if (arrySum< minSum){
                minSum = arrySum;
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+maxSum+" рублей");
        System.out.println("Минимальная сумма трат за день составила "+minSum+" рублей");




        //Задача 3
        double sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
             sum2 += arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила "+sum2/arr.length+"  рублей");



        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1 ;i > 0; i --) {
            System.out.print(reverseFullName[i]);
        }
    }
}
