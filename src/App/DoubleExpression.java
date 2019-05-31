package App;

public class DoubleExpression {
    public final static boolean doubleExpression(double firstNumber, double secondNumber, double comparisonТгьиук) {
        final double PRECISION = 1e-4;
        return (Math.abs((firstNumber + secondNumber) - comparisonТгьиук) < PRECISION);
    }
}
