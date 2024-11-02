public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.2, 6.8));

    }
    public static double area(double radius) {
        if (radius < 0){
            return -1.0;
        }//pi = 3.14159 r squared * pi
        return ((radius * radius) * 3.14159);

    }
    public static double area(double xSide, double ySide) {
        if (xSide < 0 || ySide < 0) {
            return -1.0;
        }
        return (xSide * ySide);

    }
}
