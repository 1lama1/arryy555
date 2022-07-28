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
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] > arr[i]) {
                System.out.println("Сумма трат за месяц составила " + (arr[i + 1] - arr[i]) + " рублей");
            }
        }

        //Задача 2
        int[] dayArr = {23, 24, 50, 77, 76, 30, 230, 111, 555};
        int maxSum = -1;
        int minSum = 1000;
        for (final int arrySum : dayArr) {
            if (arrySum > maxSum) {
                maxSum = arrySum;
            }if (arrySum< minSum){
                minSum = arrySum;
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+maxSum+" рублей");
        System.out.println("Минимальная сумма трат за день составила "+minSum+" рублей");




        //Задача 3
        double e = 0;
        for (int i = 0; i < arr.length; i++) {
             e += arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила "+e/arr.length+"  рублей");



        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1 ;i > 0; i --) {
            System.out.print(reverseFullName[i]);
        }
    }
}
