package Level2Calculate;

public class CalculateImplCalculate implements Caulculate {


    @Override

    public double calculate(double x, char oprate, double y) {
        double temp = 0;
        if (oprate == '+') {
            temp = x + y;
        } else if (oprate == '-') {
            temp = x - y;
        } else if (oprate == '*') {
            temp = x * y;
        } else if (oprate == '/') {
            temp = x / y;
        }
        return temp;
    }
}
