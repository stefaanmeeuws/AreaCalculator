public class AreaCalculator {
    public static double area(double radius) { // calculates the area of a circle
        if (radius < 0)
            return -1;
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) { // calculates the area of a rectangle
        /* This "if" and the following "if" whould be joined by two PIPE characters, but I can't find them on my laptop keyboard. */
        if (x < 0)
            return -1;
        if (y < 0)
            return -1;
        return x * y;
    }
}
