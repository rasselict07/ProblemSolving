package codesignal;

public class AdjacentElementProducts {
    public static void main(String[] args) {
        int[] ints = {1, 0, 1, 0, 1000};
        System.out.println(new AdjacentElementProducts().adjacentElementsProduct(ints));
    }

    int adjacentElementsProduct(int[] inputArray) {
        if (inputArray.length < 2) return 0;
        int maxAdjacentValue = 0;
        for (int i = 0; i < inputArray.length; i++) {
            int currentAdjacentValue = inputArray[i] * ((inputArray.length - 1 == i) ? inputArray[i - 1] : inputArray[i + 1]);
            if (i == 0) maxAdjacentValue = currentAdjacentValue;
            if (currentAdjacentValue > maxAdjacentValue) maxAdjacentValue = currentAdjacentValue;
        }
        return maxAdjacentValue;
    }

}
