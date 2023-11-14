import java.util.Arrays;
import java.util.Random;

public class MinMaxArray {
    public static void main(String[] args) {

        int[] arrayInt = randomArray();
        int max = 0;
        int min = arrayInt[0];

        System.out.println("Random Array: ");
        System.out.println(Arrays.toString(arrayInt));

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] >= max) {
                max = arrayInt[i];
            }

            System.out.println("MAX: " + max);
            System.out.println("MIN: " + min);
        }
    }

        private static int[] randomArray() {
            Random rd = new Random();
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = rd.nextInt(100);
            }
            return array;
        }
}
