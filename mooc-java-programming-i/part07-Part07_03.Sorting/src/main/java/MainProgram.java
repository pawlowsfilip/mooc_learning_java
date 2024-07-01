import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number: array) {
            if (smallest > number) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestNumber = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNumber) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        int smallestNumber = table[smallestIndex];
 

        for (int i = smallestIndex; i < table.length; i++) {

            if (table[i] < smallestNumber) {
                smallestNumber = table[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }

    public static void sort(int[] array) {
        int smallest = 0;
        for (int i = 0; i < array.length; i++) {
            smallest = indexOfSmallestFrom(array, i);
            swap(array, smallest, i);
            System.out.println(Arrays.toString(array));
        }
    }

}
