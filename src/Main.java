import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        System.out.println("Задача 1");

        int [] inputArray1 = {1000, 2000, 3000, 4000, 5000};
        float [] outputArray1 = new float[4];
        int sum = 0;
        int minSum = inputArray1[0];
        int maxSum = inputArray1[0];

        for(int money1 : inputArray1) {
            sum = sum + money1;
            if (money1 > maxSum) {
                maxSum = money1;
            }
            if (money1 < minSum) {
                minSum = money1;
            }
        }
        float averageSum = (float) sum / inputArray1.length;
        outputArray1 [0] = sum;
        outputArray1 [1] = maxSum;
        outputArray1 [2] = minSum;
        outputArray1 [3] = averageSum;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        System.out.println("Задача 2");
        float [] inputArray2 = {1000, 2000, 3000, 4000, 5000};
        float [] outputArray2 = new float[5];
        int tax = 0;
        for (float money2 : inputArray2) {
            outputArray2[tax] = money2 / 100 * 13;
            tax++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        System.out.println("Задача 3");
        int [] inputArray3 = {3000, 4000, 5000, 6000, 7000};
        boolean [] outputArray3 = new boolean[5];
        int i = 0;
        for (int bonus : inputArray3) {
            outputArray3 [i] = bonus > 5000;
            i++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println("Задача 4");

        int [] inputArray4 = {3000, 1000, 500, -600, 1000};
        boolean [] outputArray4 = new boolean[1];
        int index = 0;

        for (int remainder : inputArray4) {
            outputArray4 [0] = remainder > 0;
            index++;

            if (remainder < 0) {
                outputArray4 [0] = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputArray4 [0]);

        System.out.println("Задача 5");

        int [] inputArray5 = {40_000, 55_000, -20_000, 60_000, -70_000, };
        int [] outputArray5 = new int [1];
        outputArray5 [0] = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5 [0]++;
            }
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(outputArray5[0]);
    }
}