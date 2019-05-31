package App;

public class DoubleExpression {
    public final static boolean doubleExpression(double a, double b, double c) {
        final double precision = 1e-4;
        return (Math.abs((a + b) - c) < precision);
    }
}
