import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {7.0, 8.0, -9.0, -6.0, -5.0, 4.0, -3.0, 2.0, -1.0, 12.0, -13.0, 14.0, -15.0, 16.0, 17.0};
        System.out.println(Arrays.toString(numbers));

        boolean findFirstNegative = false;
        double sum = 0;
        int count = 0;

        for (double digits : numbers) {
            if (!findFirstNegative && digits < 0) {
                findFirstNegative = true;
            } else if (findFirstNegative && digits > 0) {
                sum += digits;
                count++; // +1
            }
        }

        double result = sum / count;
        if (findFirstNegative = false) {
            System.out.printf("в массиве нет отрицательных чисел: ");
        } else {
            System.out.printf("среднее арифметическое: " + result);
            System.out.printf(", сумма: " + sum);
            System.out.printf(", количество чисел: " + count);
        }
    }
}