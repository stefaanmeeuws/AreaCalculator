public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0)
            return -1;
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        /* This "if" and the following "if" whould be joined by two PIPE characters, but I can't find them on my laptop keyboard. */
        if (x < 0)
            return -1;
        if (y < 0)
            return -1;
        return x * y;
    }
}
