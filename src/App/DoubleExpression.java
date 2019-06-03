package App;

public class DoubleExpression {
    public static final double PRECISION = 1e-4;
    public final static boolean doubleExpression(double firstNumber, double secondNumber, double comparisonNumber) {
        return (Math.abs((firstNumber + secondNumber) - comparisonNumber) < PRECISION);
    }
}
