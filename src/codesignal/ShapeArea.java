package codesignal;

/**
 * Calculate the area of n value using recursion
 */
public class ShapeArea {
    public static void main(String[] args) {
        ShapeArea shapeArea = new ShapeArea();
        int result = shapeArea.shapeArea(5);
        System.out.println("Get result " + result);
    }

    /**
     * Using recursion to use the previous shape's area plus a multiple of 4 to find the new shape's area
     *
     * @param n
     * @return int of shape area
     */
    int shapeArea(int n) {
        System.out.println("initialize methods");
        if (n == 1) {
            int int_area = 1;
            System.out.println("methods " + int_area);
            return int_area;
        } else {
            int int_area = shapeArea(n - 1) + (4 * (n - 1));
            System.out.println("methods shapeArea(" + (n - 1) + ")");
            return int_area;
        }

    }
}
