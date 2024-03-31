public class ExtendedCalculator {
    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    public double cubeRoot(double num) {
        return Math.cbrt(num);
    }

    public static void main(String[] args) {
        ExtendedCalculator calculator = new ExtendedCalculator();
        double number = 64.0;

        System.out.println("Square root of " + number + ": " + calculator.squareRoot(number));
        System.out.println("Cube root of " + number + ": " + calculator.cubeRoot(number));
    }
}
