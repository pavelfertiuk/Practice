import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        bubbleSortAsc(new int[] {36, -5, 8, 0, 77, 2, 1, 54});
        bubbleSortDesc(new int[] {36, -5, 8, 0, 77, 2, 1, 54});
    }

    private static void bubbleSortAsc(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSortDesc(int[] array) {

        for (int i = 0; i < array.length -1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
