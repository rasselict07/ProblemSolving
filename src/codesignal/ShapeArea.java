package codesignal;

public class ShapeArea {
    public static void main(String[] args) {
        System.out.println(new ShapeArea().shapeArea(4));
    }

    // Using recursion to use the previous shape's area plus a multiple of 4 to find the new shape's area
    int shapeArea(int n) {
        System.out.println("methods");
        if(n == 1) {
            int int_area = 1;
            System.out.println("methods "+int_area);
            return int_area;
        }
        else {
            int int_area = shapeArea(n-1) + (4 * (n-1));
            System.out.println("methods shapeArea("+(n-1)+")");
            return int_area;
        }

    }
}
