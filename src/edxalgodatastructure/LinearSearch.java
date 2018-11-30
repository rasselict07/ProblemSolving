package edxalgodatastructure;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.println("Start Searching!");
        int[] inputArray = {1, 2, 4, 5, 6, 3434, 434, 8, 5, 6, 5, 767, 8787, 2, 3, 5, 7, 8, 9};
        int parameter = 3;
        linearSearch(inputArray, parameter);
    }

    private static void linearSearch(int[] inputArray, int parameter) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (parameter == inputArray[i]) {
                System.out.println("Found " + inputArray[i] + " at " + i + " index");
                return;
            }
        }
        System.out.println("Not found " + parameter);
    }
}
