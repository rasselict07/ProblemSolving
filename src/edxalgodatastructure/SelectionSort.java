package edxalgodatastructure;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] unsortedArray = {1,3,5,4,2,6};
        System.out.println("Before "+Arrays.toString(unsortedArray));
        new SelectionSort().sortArray(unsortedArray);
    }

    public void sortArray(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {

            int index = 0;
            int smallestElement = unsortedArray[i];
            for (int j = i; j < unsortedArray.length; j++) {
                if (smallestElement > unsortedArray[j]) {
                    smallestElement = unsortedArray[j];
                    index = j;
                }
            }

            // If smallest element found then this will work
            if (index != 0) {
                int temp = unsortedArray[i];
                unsortedArray[i] = smallestElement;
                unsortedArray[index] = temp;
            }

            System.out.println(Arrays.toString(unsortedArray));
        }

    }
}
