package App;

public class Main {
    public static void main(String[] args) {
        FirstTask first = new FirstTask();
        System.out.println(first.booleanExpression(false,false,true,true));

        LeapYear count = new LeapYear();
        System.out.println(count.leapYearCount(100));

        DoubleExpression expr = new DoubleExpression();
        System.out.println(expr.doubleExpression(0.1,0.1,0.2));

        FlipBit flipBit = new FlipBit();
        System.out.println(flipBit.flipBit(7, 2));// 0111 -> 0101
    }
}
